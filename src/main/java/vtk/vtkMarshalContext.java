// java wrapper for vtkMarshalContext object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMarshalContext extends vtkObject
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

  private native void KeepAlive_4(byte[] id0, int len0,vtkObjectBase id1);
  public void KeepAlive(String id0,vtkObjectBase id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    KeepAlive_4(bytes0, bytes0.length,id1);
  }

  private native void Retire_5(byte[] id0, int len0,vtkObjectBase id1);
  public void Retire(String id0,vtkObjectBase id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    Retire_5(bytes0, bytes0.length,id1);
  }

  private native boolean UnRegisterState_6(int id0);
  public boolean UnRegisterState(int id0)
  {
    return UnRegisterState_6(id0);
  }

  private native boolean UnRegisterObject_7(int id0);
  public boolean UnRegisterObject(int id0)
  {
    return UnRegisterObject_7(id0);
  }

  private native int GetId_8(vtkObjectBase id0);
  public int GetId(vtkObjectBase id0)
  {
    return GetId_8(id0);
  }

  private native boolean UnRegisterBlob_9(byte[] id0, int len0);
  public boolean UnRegisterBlob(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return UnRegisterBlob_9(bytes0, bytes0.length);
  }

  private native void ResetDirectDependencies_10();
  public void ResetDirectDependencies()
  {
    ResetDirectDependencies_10();
  }

  private native void ResetDirectDependenciesForNode_11(int id0);
  public void ResetDirectDependenciesForNode(int id0)
  {
    ResetDirectDependenciesForNode_11(id0);
  }

  private native int MakeId_12();
  public int MakeId()
  {
    return MakeId_12();
  }

  private native void PushParent_13(int id0);
  public void PushParent(int id0)
  {
    PushParent_13(id0);
  }

  private native void PopParent_14();
  public void PopParent()
  {
    PopParent_14();
  }

  public vtkMarshalContext() { super(); }

  public vtkMarshalContext(long id) { super(id); }
  public native long   VTKInit();

}
