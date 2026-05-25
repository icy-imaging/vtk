// java wrapper for vtkShadowMapPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkShadowMapPass extends vtkOpenGLRenderPass
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

  private native long GetShadowMapBakerPass_5();
  public vtkShadowMapBakerPass GetShadowMapBakerPass()
  {
    long temp = GetShadowMapBakerPass_5();

    if (temp == 0) return null;
    return (vtkShadowMapBakerPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetShadowMapBakerPass_6(vtkShadowMapBakerPass id0);
  public void SetShadowMapBakerPass(vtkShadowMapBakerPass id0)
  {
    SetShadowMapBakerPass_6(id0);
  }

  private native long GetOpaqueSequence_7();
  public vtkRenderPass GetOpaqueSequence()
  {
    long temp = GetOpaqueSequence_7();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOpaqueSequence_8(vtkRenderPass id0);
  public void SetOpaqueSequence(vtkRenderPass id0)
  {
    SetOpaqueSequence_8(id0);
  }

  private native long ShadowMapPass_9();
  public vtkInformationObjectBaseKey ShadowMapPass()
  {
    long temp = ShadowMapPass_9();

    if (temp == 0) return null;
    return (vtkInformationObjectBaseKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetFragmentDeclaration_10();
  public String GetFragmentDeclaration()
  {
    return new String(GetFragmentDeclaration_10(), StandardCharsets.UTF_8);
  }

  private native byte[] GetFragmentImplementation_11();
  public String GetFragmentImplementation()
  {
    return new String(GetFragmentImplementation_11(), StandardCharsets.UTF_8);
  }

  private native boolean PreReplaceShaderValues_12(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,vtkAbstractMapper id3,vtkProp id4);
  public boolean PreReplaceShaderValues(String id0,String id1,String id2,vtkAbstractMapper id3,vtkProp id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return PreReplaceShaderValues_12(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3,id4);
  }

  private native boolean PostReplaceShaderValues_13(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,vtkAbstractMapper id3,vtkProp id4);
  public boolean PostReplaceShaderValues(String id0,String id1,String id2,vtkAbstractMapper id3,vtkProp id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return PostReplaceShaderValues_13(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3,id4);
  }

  private native boolean SetShaderParameters_14(vtkShaderProgram id0,vtkAbstractMapper id1,vtkProp id2,vtkOpenGLVertexArrayObject id3);
  public boolean SetShaderParameters(vtkShaderProgram id0,vtkAbstractMapper id1,vtkProp id2,vtkOpenGLVertexArrayObject id3)
  {
    return SetShaderParameters_14(id0,id1,id2,id3);
  }

  public vtkShadowMapPass() { super(); }

  public vtkShadowMapPass(long id) { super(id); }
  public native long   VTKInit();

}
