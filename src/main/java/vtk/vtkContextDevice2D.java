// java wrapper for vtkContextDevice2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContextDevice2D extends vtkObject
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

  private native void DrawEllipseWedge_4(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7);
  public void DrawEllipseWedge(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7)
  {
    DrawEllipseWedge_4(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void DrawEllipticArc_5(float id0,float id1,float id2,float id3,float id4,float id5);
  public void DrawEllipticArc(float id0,float id1,float id2,float id3,float id4,float id5)
  {
    DrawEllipticArc_5(id0,id1,id2,id3,id4,id5);
  }

  private native void ComputeStringBounds_6(byte[] id0, int len0,float id1[]);
  public void ComputeStringBounds(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeStringBounds_6(bytes0, bytes0.length,id1);
  }

  private native void ComputeJustifiedStringBounds_7(byte[] id0, int len0,float id1[]);
  public void ComputeJustifiedStringBounds(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeJustifiedStringBounds_7(bytes0, bytes0.length,id1);
  }

  private native boolean MathTextIsSupported_8();
  public boolean MathTextIsSupported()
  {
    return MathTextIsSupported_8();
  }

  private native void DrawImage_9(float id0[],float id1,vtkImageData id2);
  public void DrawImage(float id0[],float id1,vtkImageData id2)
  {
    DrawImage_9(id0,id1,id2);
  }

  private native void DrawPolyData_10(float id0[],float id1,vtkPolyData id2,vtkUnsignedCharArray id3,int id4);
  public void DrawPolyData(float id0[],float id1,vtkPolyData id2,vtkUnsignedCharArray id3,int id4)
  {
    DrawPolyData_10(id0,id1,id2,id3,id4);
  }

  private native void ApplyPen_11(vtkPen id0);
  public void ApplyPen(vtkPen id0)
  {
    ApplyPen_11(id0);
  }

  private native long GetPen_12();
  public vtkPen GetPen()
  {
    long temp = GetPen_12();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ApplyBrush_13(vtkBrush id0);
  public void ApplyBrush(vtkBrush id0)
  {
    ApplyBrush_13(id0);
  }

  private native long GetBrush_14();
  public vtkBrush GetBrush()
  {
    long temp = GetBrush_14();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ApplyTextProp_15(vtkTextProperty id0);
  public void ApplyTextProp(vtkTextProperty id0)
  {
    ApplyTextProp_15(id0);
  }

  private native long GetTextProp_16();
  public vtkTextProperty GetTextProp()
  {
    long temp = GetTextProp_16();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTexture_17(vtkImageData id0,int id1);
  public void SetTexture(vtkImageData id0,int id1)
  {
    SetTexture_17(id0,id1);
  }

  private native void SetPointSize_18(float id0);
  public void SetPointSize(float id0)
  {
    SetPointSize_18(id0);
  }

  private native void SetLineWidth_19(float id0);
  public void SetLineWidth(float id0)
  {
    SetLineWidth_19(id0);
  }

  private native void SetLineType_20(int id0);
  public void SetLineType(int id0)
  {
    SetLineType_20(id0);
  }

  private native int GetWidth_21();
  public int GetWidth()
  {
    return GetWidth_21();
  }

  private native int GetHeight_22();
  public int GetHeight()
  {
    return GetHeight_22();
  }

  private native void SetMatrix_23(vtkMatrix3x3 id0);
  public void SetMatrix(vtkMatrix3x3 id0)
  {
    SetMatrix_23(id0);
  }

  private native void GetMatrix_24(vtkMatrix3x3 id0);
  public void GetMatrix(vtkMatrix3x3 id0)
  {
    GetMatrix_24(id0);
  }

  private native void MultiplyMatrix_25(vtkMatrix3x3 id0);
  public void MultiplyMatrix(vtkMatrix3x3 id0)
  {
    MultiplyMatrix_25(id0);
  }

  private native void PushMatrix_26();
  public void PushMatrix()
  {
    PushMatrix_26();
  }

  private native void PopMatrix_27();
  public void PopMatrix()
  {
    PopMatrix_27();
  }

  private native void DisableClipping_28();
  public void DisableClipping()
  {
    DisableClipping_28();
  }

  private native void EnableClipping_29(boolean id0);
  public void EnableClipping(boolean id0)
  {
    EnableClipping_29(id0);
  }

  private native void Begin_30(vtkViewport id0);
  public void Begin(vtkViewport id0)
  {
    Begin_30(id0);
  }

  private native void End_31();
  public void End()
  {
    End_31();
  }

  private native boolean GetBufferIdMode_32();
  public boolean GetBufferIdMode()
  {
    return GetBufferIdMode_32();
  }

  private native void BufferIdModeBegin_33(vtkAbstractContextBufferId id0);
  public void BufferIdModeBegin(vtkAbstractContextBufferId id0)
  {
    BufferIdModeBegin_33(id0);
  }

  private native void BufferIdModeEnd_34();
  public void BufferIdModeEnd()
  {
    BufferIdModeEnd_34();
  }

  public vtkContextDevice2D() { super(); }

  public vtkContextDevice2D(long id) { super(id); }
  public native long   VTKInit();

}
