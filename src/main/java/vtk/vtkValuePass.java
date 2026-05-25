// java wrapper for vtkValuePass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkValuePass extends vtkOpenGLRenderPass
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

  private native void SetInputArrayToProcess_4(int id0,byte[] id1, int len1);
  public void SetInputArrayToProcess(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetInputArrayToProcess_4(id0,bytes1, bytes1.length);
  }

  private native void SetInputArrayToProcess_5(int id0,int id1);
  public void SetInputArrayToProcess(int id0,int id1)
  {
    SetInputArrayToProcess_5(id0,id1);
  }

  private native void SetInputComponentToProcess_6(int id0);
  public void SetInputComponentToProcess(int id0)
  {
    SetInputComponentToProcess_6(id0);
  }

  private native long GetFloatImageDataArray_7(vtkRenderer id0);
  public vtkFloatArray GetFloatImageDataArray(vtkRenderer id0)
  {
    long temp = GetFloatImageDataArray_7(id0);

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReleaseGraphicsResources_8(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_8(id0);
  }

  public vtkValuePass() { super(); }

  public vtkValuePass(long id) { super(id); }
  public native long   VTKInit();

}
