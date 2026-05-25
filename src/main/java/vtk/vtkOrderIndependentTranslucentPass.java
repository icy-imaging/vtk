// java wrapper for vtkOrderIndependentTranslucentPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOrderIndependentTranslucentPass extends vtkOpenGLRenderPass
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

  private native void ReleaseGraphicsResources_4(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_4(id0);
  }

  private native long GetTranslucentPass_5();
  public vtkRenderPass GetTranslucentPass()
  {
    long temp = GetTranslucentPass_5();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTranslucentPass_6(vtkRenderPass id0);
  public void SetTranslucentPass(vtkRenderPass id0)
  {
    SetTranslucentPass_6(id0);
  }

  private native boolean PostReplaceShaderValues_7(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,vtkAbstractMapper id3,vtkProp id4);
  public boolean PostReplaceShaderValues(String id0,String id1,String id2,vtkAbstractMapper id3,vtkProp id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return PostReplaceShaderValues_7(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3,id4);
  }

  public vtkOrderIndependentTranslucentPass() { super(); }

  public vtkOrderIndependentTranslucentPass(long id) { super(id); }
  public native long   VTKInit();

}
