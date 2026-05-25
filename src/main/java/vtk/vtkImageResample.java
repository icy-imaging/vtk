// java wrapper for vtkImageResample object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageResample extends vtkImageReslice
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

  private native void SetOutputSpacing_4(double id0,double id1,double id2);
  public void SetOutputSpacing(double id0,double id1,double id2)
  {
    SetOutputSpacing_4(id0,id1,id2);
  }

  private native void SetOutputSpacing_5(double id0[]);
  public void SetOutputSpacing(double id0[])
  {
    SetOutputSpacing_5(id0);
  }

  private native void SetAxisOutputSpacing_6(int id0,double id1);
  public void SetAxisOutputSpacing(int id0,double id1)
  {
    SetAxisOutputSpacing_6(id0,id1);
  }

  private native void SetMagnificationFactors_7(double id0,double id1,double id2);
  public void SetMagnificationFactors(double id0,double id1,double id2)
  {
    SetMagnificationFactors_7(id0,id1,id2);
  }

  private native void SetMagnificationFactors_8(double id0[]);
  public void SetMagnificationFactors(double id0[])
  {
    SetMagnificationFactors_8(id0);
  }

  private native double[] GetMagnificationFactors_9();
  public double[] GetMagnificationFactors()
  {
    return GetMagnificationFactors_9();
  }

  private native void SetAxisMagnificationFactor_10(int id0,double id1);
  public void SetAxisMagnificationFactor(int id0,double id1)
  {
    SetAxisMagnificationFactor_10(id0,id1);
  }

  private native double GetAxisMagnificationFactor_11(int id0,vtkInformation id1);
  public double GetAxisMagnificationFactor(int id0,vtkInformation id1)
  {
    return GetAxisMagnificationFactor_11(id0,id1);
  }

  private native void SetDimensionality_12(int id0);
  public void SetDimensionality(int id0)
  {
    SetDimensionality_12(id0);
  }

  private native int GetDimensionality_13();
  public int GetDimensionality()
  {
    return GetDimensionality_13();
  }

  public vtkImageResample() { super(); }

  public vtkImageResample(long id) { super(id); }
  public native long   VTKInit();

}
