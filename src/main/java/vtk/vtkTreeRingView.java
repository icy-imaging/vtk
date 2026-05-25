// java wrapper for vtkTreeRingView object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeRingView extends vtkTreeAreaView
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

  private native void SetRootAngles_4(double id0,double id1);
  public void SetRootAngles(double id0,double id1)
  {
    SetRootAngles_4(id0,id1);
  }

  private native void SetRootAtCenter_5(boolean id0);
  public void SetRootAtCenter(boolean id0)
  {
    SetRootAtCenter_5(id0);
  }

  private native boolean GetRootAtCenter_6();
  public boolean GetRootAtCenter()
  {
    return GetRootAtCenter_6();
  }

  private native void RootAtCenterOn_7();
  public void RootAtCenterOn()
  {
    RootAtCenterOn_7();
  }

  private native void RootAtCenterOff_8();
  public void RootAtCenterOff()
  {
    RootAtCenterOff_8();
  }

  private native void SetLayerThickness_9(double id0);
  public void SetLayerThickness(double id0)
  {
    SetLayerThickness_9(id0);
  }

  private native double GetLayerThickness_10();
  public double GetLayerThickness()
  {
    return GetLayerThickness_10();
  }

  private native void SetInteriorRadius_11(double id0);
  public void SetInteriorRadius(double id0)
  {
    SetInteriorRadius_11(id0);
  }

  private native double GetInteriorRadius_12();
  public double GetInteriorRadius()
  {
    return GetInteriorRadius_12();
  }

  private native void SetInteriorLogSpacingValue_13(double id0);
  public void SetInteriorLogSpacingValue(double id0)
  {
    SetInteriorLogSpacingValue_13(id0);
  }

  private native double GetInteriorLogSpacingValue_14();
  public double GetInteriorLogSpacingValue()
  {
    return GetInteriorLogSpacingValue_14();
  }

  public vtkTreeRingView() { super(); }

  public vtkTreeRingView(long id) { super(id); }
  public native long   VTKInit();

}
