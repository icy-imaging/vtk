// java wrapper for vtkObjectBase object
//

package vtk;
import java.nio.charset.*;


public class vtkObjectBase
{

  private native byte[] GetClassName_0();
  public String GetClassName()
  {
    return new String(GetClassName_0(), StandardCharsets.UTF_8);
  }

  private native byte[] GetObjectDescription_1();
  public String GetObjectDescription()
  {
    return new String(GetObjectDescription_1(), StandardCharsets.UTF_8);
  }

  private native int IsTypeOf_2(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_2(bytes0, bytes0.length);
  }

  private native int IsA_3(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_3(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_4(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_4(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_5(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_5(bytes0, bytes0.length);
  }

  private native void FastDelete_6();
  public void FastDelete()
  {
    FastDelete_6();
  }

  private native void InitializeObjectBase_7();
  public void InitializeObjectBase()
  {
    InitializeObjectBase_7();
  }

  private native void Register_8(vtkObjectBase id0);
  public void Register(vtkObjectBase id0)
  {
    Register_8(id0);
  }

  private native void UnRegister_9(vtkObjectBase id0);
  public void UnRegister(vtkObjectBase id0)
  {
    UnRegister_9(id0);
  }

  private native boolean UsesGarbageCollector_10();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_10();
  }

  private native int GetReferenceCount_11();
  public int GetReferenceCount()
  {
    return GetReferenceCount_11();
  }

  private native void SetReferenceCount_12(int id0);
  public void SetReferenceCount(int id0)
  {
    SetReferenceCount_12(id0);
  }

  private native void SetMemkindDirectory_13(byte[] id0, int len0);
  public void SetMemkindDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMemkindDirectory_13(bytes0, bytes0.length);
  }

  private native boolean GetUsingMemkind_14();
  public boolean GetUsingMemkind()
  {
    return GetUsingMemkind_14();
  }

  private native boolean GetIsInMemkind_15();
  public boolean GetIsInMemkind()
  {
    return GetIsInMemkind_15();
  }

  public static vtk.vtkJavaMemoryManager JAVA_OBJECT_MANAGER = new vtk.vtkJavaMemoryManagerImpl();
  public vtkObjectBase() {
    this.vtkId = this.VTKInit();
    vtkObjectBase.JAVA_OBJECT_MANAGER.registerJavaObject(this.vtkId, this);
}

  public vtkObjectBase(long id) {
    super();
    this.vtkId = id;
    this.VTKRegister();
    vtkObjectBase.JAVA_OBJECT_MANAGER.registerJavaObject(this.vtkId, this);
}

  protected long vtkId;

  public long GetVTKId() { return this.vtkId; }
  public static native void VTKDeleteReference(long id);
  private static native byte[] VTKGetClassNameBytesFromReference(long id);
  public static String VTKGetClassNameFromReference(long id)
  {
    return new String(VTKGetClassNameBytesFromReference(id),StandardCharsets.UTF_8);
  }
  protected native void VTKDelete();
  protected native void VTKRegister();
  public void Delete()
  {
    vtkObjectBase.JAVA_OBJECT_MANAGER.unRegisterJavaObject(this.vtkId);
    this.vtkId = 0;
  }
  public native long   VTKInit();

  private native byte[] PrintBytes();
  public String Print()
  {
    return new String(PrintBytes(),StandardCharsets.UTF_8);
  }
  public String toString() { return Print(); }

}
