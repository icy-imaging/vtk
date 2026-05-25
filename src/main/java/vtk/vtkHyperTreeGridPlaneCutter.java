// java wrapper for vtkHyperTreeGridPlaneCutter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridPlaneCutter extends vtkHyperTreeGridAlgorithm
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

  private native void SetPlane_4(double id0,double id1,double id2,double id3);
  public void SetPlane(double id0,double id1,double id2,double id3)
  {
    SetPlane_4(id0,id1,id2,id3);
  }

  private native double[] GetPlane_5();
  public double[] GetPlane()
  {
    return GetPlane_5();
  }

  private native int GetAxisAlignment_6();
  public int GetAxisAlignment()
  {
    return GetAxisAlignment_6();
  }

  private native boolean IsPlaneOrthogonalToXAxis_7();
  public boolean IsPlaneOrthogonalToXAxis()
  {
    return IsPlaneOrthogonalToXAxis_7();
  }

  private native boolean IsPlaneOrthogonalToYAxis_8();
  public boolean IsPlaneOrthogonalToYAxis()
  {
    return IsPlaneOrthogonalToYAxis_8();
  }

  private native boolean IsPlaneOrthogonalToZAxis_9();
  public boolean IsPlaneOrthogonalToZAxis()
  {
    return IsPlaneOrthogonalToZAxis_9();
  }

  private native void SetDual_10(int id0);
  public void SetDual(int id0)
  {
    SetDual_10(id0);
  }

  private native int GetDual_11();
  public int GetDual()
  {
    return GetDual_11();
  }

  private native void DualOn_12();
  public void DualOn()
  {
    DualOn_12();
  }

  private native void DualOff_13();
  public void DualOff()
  {
    DualOff_13();
  }

  public vtkHyperTreeGridPlaneCutter() { super(); }

  public vtkHyperTreeGridPlaneCutter(long id) { super(id); }
  public native long   VTKInit();

}
