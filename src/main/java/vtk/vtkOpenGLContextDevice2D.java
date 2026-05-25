// java wrapper for vtkOpenGLContextDevice2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLContextDevice2D extends vtkContextDevice2D
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

  private native void SetMaximumMarkerCacheSize_4(int id0);
  public void SetMaximumMarkerCacheSize(int id0)
  {
    SetMaximumMarkerCacheSize_4(id0);
  }

  private native int GetMaximumMarkerCacheSize_5();
  public int GetMaximumMarkerCacheSize()
  {
    return GetMaximumMarkerCacheSize_5();
  }

  private native void DrawEllipseWedge_6(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7);
  public void DrawEllipseWedge(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7)
  {
    DrawEllipseWedge_6(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void DrawEllipticArc_7(float id0,float id1,float id2,float id3,float id4,float id5);
  public void DrawEllipticArc(float id0,float id1,float id2,float id3,float id4,float id5)
  {
    DrawEllipticArc_7(id0,id1,id2,id3,id4,id5);
  }

  private native void ComputeStringBounds_8(byte[] id0, int len0,float id1[]);
  public void ComputeStringBounds(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeStringBounds_8(bytes0, bytes0.length,id1);
  }

  private native void ComputeJustifiedStringBounds_9(byte[] id0, int len0,float id1[]);
  public void ComputeJustifiedStringBounds(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeJustifiedStringBounds_9(bytes0, bytes0.length,id1);
  }

  private native void DrawMathTextString_10(float id0[],byte[] id1, int len1);
  public void DrawMathTextString(float id0[],String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    DrawMathTextString_10(id0,bytes1, bytes1.length);
  }

  private native void DrawImage_11(float id0[],float id1,vtkImageData id2);
  public void DrawImage(float id0[],float id1,vtkImageData id2)
  {
    DrawImage_11(id0,id1,id2);
  }

  private native void DrawPolyData_12(float id0[],float id1,vtkPolyData id2,vtkUnsignedCharArray id3,int id4);
  public void DrawPolyData(float id0[],float id1,vtkPolyData id2,vtkUnsignedCharArray id3,int id4)
  {
    DrawPolyData_12(id0,id1,id2,id3,id4);
  }

  private native void SetTexture_13(vtkImageData id0,int id1);
  public void SetTexture(vtkImageData id0,int id1)
  {
    SetTexture_13(id0,id1);
  }

  private native void SetPointSize_14(float id0);
  public void SetPointSize(float id0)
  {
    SetPointSize_14(id0);
  }

  private native void SetLineWidth_15(float id0);
  public void SetLineWidth(float id0)
  {
    SetLineWidth_15(id0);
  }

  private native void SetLineType_16(int id0);
  public void SetLineType(int id0)
  {
    SetLineType_16(id0);
  }

  private native void MultiplyMatrix_17(vtkMatrix3x3 id0);
  public void MultiplyMatrix(vtkMatrix3x3 id0)
  {
    MultiplyMatrix_17(id0);
  }

  private native void SetMatrix_18(vtkMatrix3x3 id0);
  public void SetMatrix(vtkMatrix3x3 id0)
  {
    SetMatrix_18(id0);
  }

  private native void GetMatrix_19(vtkMatrix3x3 id0);
  public void GetMatrix(vtkMatrix3x3 id0)
  {
    GetMatrix_19(id0);
  }

  private native void PushMatrix_20();
  public void PushMatrix()
  {
    PushMatrix_20();
  }

  private native void PopMatrix_21();
  public void PopMatrix()
  {
    PopMatrix_21();
  }

  private native void EnableClipping_22(boolean id0);
  public void EnableClipping(boolean id0)
  {
    EnableClipping_22(id0);
  }

  private native void Begin_23(vtkViewport id0);
  public void Begin(vtkViewport id0)
  {
    Begin_23(id0);
  }

  private native void End_24();
  public void End()
  {
    End_24();
  }

  private native void BufferIdModeBegin_25(vtkAbstractContextBufferId id0);
  public void BufferIdModeBegin(vtkAbstractContextBufferId id0)
  {
    BufferIdModeBegin_25(id0);
  }

  private native void BufferIdModeEnd_26();
  public void BufferIdModeEnd()
  {
    BufferIdModeEnd_26();
  }

  private native boolean SetStringRendererToFreeType_27();
  public boolean SetStringRendererToFreeType()
  {
    return SetStringRendererToFreeType_27();
  }

  private native boolean SetStringRendererToQt_28();
  public boolean SetStringRendererToQt()
  {
    return SetStringRendererToQt_28();
  }

  private native boolean HasGLSL_29();
  public boolean HasGLSL()
  {
    return HasGLSL_29();
  }

  private native long GetRenderWindow_30();
  public vtkOpenGLRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_30();

    if (temp == 0) return null;
    return (vtkOpenGLRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReleaseGraphicsResources_31(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_31(id0);
  }

  private native long GetProjectionMatrix_32();
  public vtkMatrix4x4 GetProjectionMatrix()
  {
    long temp = GetProjectionMatrix_32();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetModelMatrix_33();
  public vtkMatrix4x4 GetModelMatrix()
  {
    long temp = GetModelMatrix_33();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkOpenGLContextDevice2D() { super(); }

  public vtkOpenGLContextDevice2D(long id) { super(id); }
  public native long   VTKInit();

}
