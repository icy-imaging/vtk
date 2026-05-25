// java wrapper for vtkCleanArrays object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCleanArrays extends vtkPassInputTypeAlgorithm
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

  private native void SetController_4(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_4(id0);
  }

  private native long GetController_5();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_5();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFillPartialArrays_6(boolean id0);
  public void SetFillPartialArrays(boolean id0)
  {
    SetFillPartialArrays_6(id0);
  }

  private native boolean GetFillPartialArrays_7();
  public boolean GetFillPartialArrays()
  {
    return GetFillPartialArrays_7();
  }

  private native void FillPartialArraysOn_8();
  public void FillPartialArraysOn()
  {
    FillPartialArraysOn_8();
  }

  private native void FillPartialArraysOff_9();
  public void FillPartialArraysOff()
  {
    FillPartialArraysOff_9();
  }

  private native void SetMarkFilledPartialArrays_10(boolean id0);
  public void SetMarkFilledPartialArrays(boolean id0)
  {
    SetMarkFilledPartialArrays_10(id0);
  }

  private native boolean GetMarkFilledPartialArrays_11();
  public boolean GetMarkFilledPartialArrays()
  {
    return GetMarkFilledPartialArrays_11();
  }

  private native void MarkFilledPartialArraysOn_12();
  public void MarkFilledPartialArraysOn()
  {
    MarkFilledPartialArraysOn_12();
  }

  private native void MarkFilledPartialArraysOff_13();
  public void MarkFilledPartialArraysOff()
  {
    MarkFilledPartialArraysOff_13();
  }

  public vtkCleanArrays() { super(); }

  public vtkCleanArrays(long id) { super(id); }
  public native long   VTKInit();

}
