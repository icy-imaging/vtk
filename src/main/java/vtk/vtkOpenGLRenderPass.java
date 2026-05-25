// java wrapper for vtkOpenGLRenderPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLRenderPass extends vtkRenderPass
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

  private native boolean PreReplaceShaderValues_4(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,vtkAbstractMapper id3,vtkProp id4);
  public boolean PreReplaceShaderValues(String id0,String id1,String id2,vtkAbstractMapper id3,vtkProp id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return PreReplaceShaderValues_4(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3,id4);
  }

  private native boolean PostReplaceShaderValues_5(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,vtkAbstractMapper id3,vtkProp id4);
  public boolean PostReplaceShaderValues(String id0,String id1,String id2,vtkAbstractMapper id3,vtkProp id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return PostReplaceShaderValues_5(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3,id4);
  }

  private native boolean SetShaderParameters_6(vtkShaderProgram id0,vtkAbstractMapper id1,vtkProp id2,vtkOpenGLVertexArrayObject id3);
  public boolean SetShaderParameters(vtkShaderProgram id0,vtkAbstractMapper id1,vtkProp id2,vtkOpenGLVertexArrayObject id3)
  {
    return SetShaderParameters_6(id0,id1,id2,id3);
  }

  private native long GetShaderStageMTime_7();
  public long GetShaderStageMTime()
  {
    return GetShaderStageMTime_7();
  }

  private native long RenderPasses_8();
  public vtkInformationObjectBaseVectorKey RenderPasses()
  {
    long temp = RenderPasses_8();

    if (temp == 0) return null;
    return (vtkInformationObjectBaseVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetActiveDrawBuffers_9(int id0);
  public void SetActiveDrawBuffers(int id0)
  {
    SetActiveDrawBuffers_9(id0);
  }

  private native int GetActiveDrawBuffers_10();
  public int GetActiveDrawBuffers()
  {
    return GetActiveDrawBuffers_10();
  }

  public vtkOpenGLRenderPass() { super(); }

  public vtkOpenGLRenderPass(long id) { super(id); }

}
