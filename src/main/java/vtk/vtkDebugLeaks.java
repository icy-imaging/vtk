// java wrapper for vtkDebugLeaks object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDebugLeaks extends vtkObject
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

  private native void ConstructClass_4(vtkObjectBase id0);
  public void ConstructClass(vtkObjectBase id0)
  {
    ConstructClass_4(id0);
  }

  private native void ConstructClass_5(byte[] id0, int len0);
  public void ConstructClass(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ConstructClass_5(bytes0, bytes0.length);
  }

  private native void DestructClass_6(vtkObjectBase id0);
  public void DestructClass(vtkObjectBase id0)
  {
    DestructClass_6(id0);
  }

  private native void DestructClass_7(byte[] id0, int len0);
  public void DestructClass(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DestructClass_7(bytes0, bytes0.length);
  }

  private native int PrintCurrentLeaks_8();
  public int PrintCurrentLeaks()
  {
    return PrintCurrentLeaks_8();
  }

  private native int GetExitError_9();
  public int GetExitError()
  {
    return GetExitError_9();
  }

  private native void SetExitError_10(int id0);
  public void SetExitError(int id0)
  {
    SetExitError_10(id0);
  }

  public vtkDebugLeaks() { super(); }

  public vtkDebugLeaks(long id) { super(id); }
  public native long   VTKInit();

}
