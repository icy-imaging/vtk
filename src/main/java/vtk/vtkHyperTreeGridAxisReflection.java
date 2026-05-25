// java wrapper for vtkHyperTreeGridAxisReflection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridAxisReflection extends vtkHyperTreeGridAlgorithm
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

  private native void SetPlane_4(int id0);
  public void SetPlane(int id0)
  {
    SetPlane_4(id0);
  }

  private native int GetPlaneMinValue_5();
  public int GetPlaneMinValue()
  {
    return GetPlaneMinValue_5();
  }

  private native int GetPlaneMaxValue_6();
  public int GetPlaneMaxValue()
  {
    return GetPlaneMaxValue_6();
  }

  private native int GetPlane_7();
  public int GetPlane()
  {
    return GetPlane_7();
  }

  private native void SetPlaneToX_8();
  public void SetPlaneToX()
  {
    SetPlaneToX_8();
  }

  private native void SetPlaneToY_9();
  public void SetPlaneToY()
  {
    SetPlaneToY_9();
  }

  private native void SetPlaneToZ_10();
  public void SetPlaneToZ()
  {
    SetPlaneToZ_10();
  }

  private native void SetPlaneToXMin_11();
  public void SetPlaneToXMin()
  {
    SetPlaneToXMin_11();
  }

  private native void SetPlaneToYMin_12();
  public void SetPlaneToYMin()
  {
    SetPlaneToYMin_12();
  }

  private native void SetPlaneToZMin_13();
  public void SetPlaneToZMin()
  {
    SetPlaneToZMin_13();
  }

  private native void SetPlaneToXMax_14();
  public void SetPlaneToXMax()
  {
    SetPlaneToXMax_14();
  }

  private native void SetPlaneToYMax_15();
  public void SetPlaneToYMax()
  {
    SetPlaneToYMax_15();
  }

  private native void SetPlaneToZMax_16();
  public void SetPlaneToZMax()
  {
    SetPlaneToZMax_16();
  }

  private native void SetCenter_17(double id0);
  public void SetCenter(double id0)
  {
    SetCenter_17(id0);
  }

  private native double GetCenter_18();
  public double GetCenter()
  {
    return GetCenter_18();
  }

  public vtkHyperTreeGridAxisReflection() { super(); }

  public vtkHyperTreeGridAxisReflection(long id) { super(id); }
  public native long   VTKInit();

}
