// java wrapper for vtkDuplicatePolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDuplicatePolyData extends vtkPolyDataAlgorithm
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

  private native void InitializeSchedule_6(int id0);
  public void InitializeSchedule(int id0)
  {
    InitializeSchedule_6(id0);
  }

  private native void SetSynchronous_7(int id0);
  public void SetSynchronous(int id0)
  {
    SetSynchronous_7(id0);
  }

  private native int GetSynchronous_8();
  public int GetSynchronous()
  {
    return GetSynchronous_8();
  }

  private native void SynchronousOn_9();
  public void SynchronousOn()
  {
    SynchronousOn_9();
  }

  private native void SynchronousOff_10();
  public void SynchronousOff()
  {
    SynchronousOff_10();
  }

  private native long GetSocketController_11();
  public vtkSocketController GetSocketController()
  {
    long temp = GetSocketController_11();

    if (temp == 0) return null;
    return (vtkSocketController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSocketController_12(vtkSocketController id0);
  public void SetSocketController(vtkSocketController id0)
  {
    SetSocketController_12(id0);
  }

  private native void SetClientFlag_13(int id0);
  public void SetClientFlag(int id0)
  {
    SetClientFlag_13(id0);
  }

  private native int GetClientFlag_14();
  public int GetClientFlag()
  {
    return GetClientFlag_14();
  }

  private native long GetMemorySize_15();
  public long GetMemorySize()
  {
    return GetMemorySize_15();
  }

  public vtkDuplicatePolyData() { super(); }

  public vtkDuplicatePolyData(long id) { super(id); }
  public native long   VTKInit();

}
