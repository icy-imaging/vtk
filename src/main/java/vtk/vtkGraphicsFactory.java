// java wrapper for vtkGraphicsFactory object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphicsFactory extends vtkObject
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

  private native long CreateInstance_4(byte[] id0, int len0);
  public vtkObject CreateInstance(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = CreateInstance_4(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetRenderLibrary_5();
  public String GetRenderLibrary()
  {
    return new String(GetRenderLibrary_5(), StandardCharsets.UTF_8);
  }

  private native void SetUseMesaClasses_6(int id0);
  public void SetUseMesaClasses(int id0)
  {
    SetUseMesaClasses_6(id0);
  }

  private native int GetUseMesaClasses_7();
  public int GetUseMesaClasses()
  {
    return GetUseMesaClasses_7();
  }

  private native void SetOffScreenOnlyMode_8(int id0);
  public void SetOffScreenOnlyMode(int id0)
  {
    SetOffScreenOnlyMode_8(id0);
  }

  private native int GetOffScreenOnlyMode_9();
  public int GetOffScreenOnlyMode()
  {
    return GetOffScreenOnlyMode_9();
  }

  public vtkGraphicsFactory() { super(); }

  public vtkGraphicsFactory(long id) { super(id); }
  public native long   VTKInit();

}
