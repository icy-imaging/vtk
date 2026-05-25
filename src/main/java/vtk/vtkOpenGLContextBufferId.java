// java wrapper for vtkOpenGLContextBufferId object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLContextBufferId extends vtkAbstractContextBufferId
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

  private native void ReleaseGraphicsResources_4();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_4();
  }

  private native void SetContext_5(vtkRenderWindow id0);
  public void SetContext(vtkRenderWindow id0)
  {
    SetContext_5(id0);
  }

  private native long GetContext_6();
  public vtkRenderWindow GetContext()
  {
    long temp = GetContext_6();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean IsSupported_7();
  public boolean IsSupported()
  {
    return IsSupported_7();
  }

  private native void Allocate_8();
  public void Allocate()
  {
    Allocate_8();
  }

  private native boolean IsAllocated_9();
  public boolean IsAllocated()
  {
    return IsAllocated_9();
  }

  private native void SetValues_10(int id0,int id1);
  public void SetValues(int id0,int id1)
  {
    SetValues_10(id0,id1);
  }

  private native long GetPickedItem_11(int id0,int id1);
  public long GetPickedItem(int id0,int id1)
  {
    return GetPickedItem_11(id0,id1);
  }

  public vtkOpenGLContextBufferId() { super(); }

  public vtkOpenGLContextBufferId(long id) { super(id); }
  public native long   VTKInit();

}
