// java wrapper for vtkDepthPeelingPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDepthPeelingPass extends vtkOpenGLRenderPass
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

  private native void SetOcclusionRatio_7(double id0);
  public void SetOcclusionRatio(double id0)
  {
    SetOcclusionRatio_7(id0);
  }

  private native double GetOcclusionRatioMinValue_8();
  public double GetOcclusionRatioMinValue()
  {
    return GetOcclusionRatioMinValue_8();
  }

  private native double GetOcclusionRatioMaxValue_9();
  public double GetOcclusionRatioMaxValue()
  {
    return GetOcclusionRatioMaxValue_9();
  }

  private native double GetOcclusionRatio_10();
  public double GetOcclusionRatio()
  {
    return GetOcclusionRatio_10();
  }

  private native void SetMaximumNumberOfPeels_11(int id0);
  public void SetMaximumNumberOfPeels(int id0)
  {
    SetMaximumNumberOfPeels_11(id0);
  }

  private native int GetMaximumNumberOfPeels_12();
  public int GetMaximumNumberOfPeels()
  {
    return GetMaximumNumberOfPeels_12();
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

  private native void SetOpaqueZTexture_15(vtkTextureObject id0);
  public void SetOpaqueZTexture(vtkTextureObject id0)
  {
    SetOpaqueZTexture_15(id0);
  }

  private native void SetOpaqueRGBATexture_16(vtkTextureObject id0);
  public void SetOpaqueRGBATexture(vtkTextureObject id0)
  {
    SetOpaqueRGBATexture_16(id0);
  }

  private native void SetDepthFormat_17(int id0);
  public void SetDepthFormat(int id0)
  {
    SetDepthFormat_17(id0);
  }

  public vtkDepthPeelingPass() { super(); }

  public vtkDepthPeelingPass(long id) { super(id); }
  public native long   VTKInit();

}
