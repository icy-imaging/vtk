// java wrapper for vtkExtractSurface object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractSurface extends vtkPolyDataAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetRadius_4(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_4(id0);
  }

  private native double GetRadiusMinValue_5();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_5();
  }

  private native double GetRadiusMaxValue_6();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_6();
  }

  private native double GetRadius_7();
  public double GetRadius()
  {
    return GetRadius_7();
  }

  private native void SetHoleFilling_8(boolean id0);
  public void SetHoleFilling(boolean id0)
  {
    SetHoleFilling_8(id0);
  }

  private native boolean GetHoleFilling_9();
  public boolean GetHoleFilling()
  {
    return GetHoleFilling_9();
  }

  private native void HoleFillingOn_10();
  public void HoleFillingOn()
  {
    HoleFillingOn_10();
  }

  private native void HoleFillingOff_11();
  public void HoleFillingOff()
  {
    HoleFillingOff_11();
  }

  private native void SetComputeNormals_12(int id0);
  public void SetComputeNormals(int id0)
  {
    SetComputeNormals_12(id0);
  }

  private native int GetComputeNormals_13();
  public int GetComputeNormals()
  {
    return GetComputeNormals_13();
  }

  private native void ComputeNormalsOn_14();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_14();
  }

  private native void ComputeNormalsOff_15();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_15();
  }

  private native void SetComputeGradients_16(int id0);
  public void SetComputeGradients(int id0)
  {
    SetComputeGradients_16(id0);
  }

  private native int GetComputeGradients_17();
  public int GetComputeGradients()
  {
    return GetComputeGradients_17();
  }

  private native void ComputeGradientsOn_18();
  public void ComputeGradientsOn()
  {
    ComputeGradientsOn_18();
  }

  private native void ComputeGradientsOff_19();
  public void ComputeGradientsOff()
  {
    ComputeGradientsOff_19();
  }

  public vtkExtractSurface() { super(); }

  public vtkExtractSurface(long id) { super(id); }
  public native long   VTKInit();

}
