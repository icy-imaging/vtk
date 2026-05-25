// java wrapper for vtkGarbageCollector object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGarbageCollector extends vtkObject
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

  private native void Collect_4();
  public void Collect()
  {
    Collect_4();
  }

  private native void Collect_5(vtkObjectBase id0);
  public void Collect(vtkObjectBase id0)
  {
    Collect_5(id0);
  }

  private native void DeferredCollectionPush_6();
  public void DeferredCollectionPush()
  {
    DeferredCollectionPush_6();
  }

  private native void DeferredCollectionPop_7();
  public void DeferredCollectionPop()
  {
    DeferredCollectionPop_7();
  }

  private native void SetGlobalDebugFlag_8(boolean id0);
  public void SetGlobalDebugFlag(boolean id0)
  {
    SetGlobalDebugFlag_8(id0);
  }

  private native boolean GetGlobalDebugFlag_9();
  public boolean GetGlobalDebugFlag()
  {
    return GetGlobalDebugFlag_9();
  }

  public vtkGarbageCollector() { super(); }

  public vtkGarbageCollector(long id) { super(id); }
  public native long   VTKInit();

}
