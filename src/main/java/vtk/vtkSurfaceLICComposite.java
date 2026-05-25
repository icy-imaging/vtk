// java wrapper for vtkSurfaceLICComposite object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSurfaceLICComposite extends vtkObject
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

  private native void SetStrategy_4(int id0);
  public void SetStrategy(int id0)
  {
    SetStrategy_4(id0);
  }

  private native int GetStrategy_5();
  public int GetStrategy()
  {
    return GetStrategy_5();
  }

  private native int GetNumberOfCompositeExtents_6();
  public int GetNumberOfCompositeExtents()
  {
    return GetNumberOfCompositeExtents_6();
  }

  private native void SetContext_7(vtkOpenGLRenderWindow id0);
  public void SetContext(vtkOpenGLRenderWindow id0)
  {
    SetContext_7(id0);
  }

  private native long GetContext_8();
  public vtkOpenGLRenderWindow GetContext()
  {
    long temp = GetContext_8();

    if (temp == 0) return null;
    return (vtkOpenGLRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RestoreDefaultCommunicator_9();
  public void RestoreDefaultCommunicator()
  {
    RestoreDefaultCommunicator_9();
  }

  public vtkSurfaceLICComposite() { super(); }

  public vtkSurfaceLICComposite(long id) { super(id); }
  public native long   VTKInit();

}
