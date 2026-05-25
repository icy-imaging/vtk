// java wrapper for vtkContext2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContext2D extends vtkObject
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

  private native boolean Begin_4(vtkContextDevice2D id0);
  public boolean Begin(vtkContextDevice2D id0)
  {
    return Begin_4(id0);
  }

  private native long GetDevice_5();
  public vtkContextDevice2D GetDevice()
  {
    long temp = GetDevice_5();

    if (temp == 0) return null;
    return (vtkContextDevice2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean End_6();
  public boolean End()
  {
    return End_6();
  }

  private native boolean GetBufferIdMode_7();
  public boolean GetBufferIdMode()
  {
    return GetBufferIdMode_7();
  }

  private native void BufferIdModeBegin_8(vtkAbstractContextBufferId id0);
  public void BufferIdModeBegin(vtkAbstractContextBufferId id0)
  {
    BufferIdModeBegin_8(id0);
  }

  private native void BufferIdModeEnd_9();
  public void BufferIdModeEnd()
  {
    BufferIdModeEnd_9();
  }

  private native void DrawLine_10(float id0,float id1,float id2,float id3);
  public void DrawLine(float id0,float id1,float id2,float id3)
  {
    DrawLine_10(id0,id1,id2,id3);
  }

  private native void DrawLine_11(float id0[]);
  public void DrawLine(float id0[])
  {
    DrawLine_11(id0);
  }

  private native void DrawLine_12(vtkPoints2D id0);
  public void DrawLine(vtkPoints2D id0)
  {
    DrawLine_12(id0);
  }

  private native void DrawPoly_13(vtkPoints2D id0);
  public void DrawPoly(vtkPoints2D id0)
  {
    DrawPoly_13(id0);
  }

  private native void DrawLines_14(vtkPoints2D id0);
  public void DrawLines(vtkPoints2D id0)
  {
    DrawLines_14(id0);
  }

  private native void DrawPoint_15(float id0,float id1);
  public void DrawPoint(float id0,float id1)
  {
    DrawPoint_15(id0,id1);
  }

  private native void DrawPoints_16(vtkPoints2D id0);
  public void DrawPoints(vtkPoints2D id0)
  {
    DrawPoints_16(id0);
  }

  private native void DrawPointSprites_17(vtkImageData id0,vtkPoints2D id1);
  public void DrawPointSprites(vtkImageData id0,vtkPoints2D id1)
  {
    DrawPointSprites_17(id0,id1);
  }

  private native void DrawPointSprites_18(vtkImageData id0,vtkPoints2D id1,vtkUnsignedCharArray id2);
  public void DrawPointSprites(vtkImageData id0,vtkPoints2D id1,vtkUnsignedCharArray id2)
  {
    DrawPointSprites_18(id0,id1,id2);
  }

  private native void DrawMarkers_19(int id0,boolean id1,vtkPoints2D id2);
  public void DrawMarkers(int id0,boolean id1,vtkPoints2D id2)
  {
    DrawMarkers_19(id0,id1,id2);
  }

  private native void DrawMarkers_20(int id0,boolean id1,vtkPoints2D id2,vtkUnsignedCharArray id3);
  public void DrawMarkers(int id0,boolean id1,vtkPoints2D id2,vtkUnsignedCharArray id3)
  {
    DrawMarkers_20(id0,id1,id2,id3);
  }

  private native void DrawRect_21(float id0,float id1,float id2,float id3);
  public void DrawRect(float id0,float id1,float id2,float id3)
  {
    DrawRect_21(id0,id1,id2,id3);
  }

  private native void DrawQuad_22(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7);
  public void DrawQuad(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7)
  {
    DrawQuad_22(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void DrawQuadStrip_23(vtkPoints2D id0);
  public void DrawQuadStrip(vtkPoints2D id0)
  {
    DrawQuadStrip_23(id0);
  }

  private native void DrawPolygon_24(vtkPoints2D id0);
  public void DrawPolygon(vtkPoints2D id0)
  {
    DrawPolygon_24(id0);
  }

  private native void DrawEllipse_25(float id0,float id1,float id2,float id3);
  public void DrawEllipse(float id0,float id1,float id2,float id3)
  {
    DrawEllipse_25(id0,id1,id2,id3);
  }

  private native void DrawWedge_26(float id0,float id1,float id2,float id3,float id4,float id5);
  public void DrawWedge(float id0,float id1,float id2,float id3,float id4,float id5)
  {
    DrawWedge_26(id0,id1,id2,id3,id4,id5);
  }

  private native void DrawEllipseWedge_27(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7);
  public void DrawEllipseWedge(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7)
  {
    DrawEllipseWedge_27(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void DrawArc_28(float id0,float id1,float id2,float id3,float id4);
  public void DrawArc(float id0,float id1,float id2,float id3,float id4)
  {
    DrawArc_28(id0,id1,id2,id3,id4);
  }

  private native void DrawEllipticArc_29(float id0,float id1,float id2,float id3,float id4,float id5);
  public void DrawEllipticArc(float id0,float id1,float id2,float id3,float id4,float id5)
  {
    DrawEllipticArc_29(id0,id1,id2,id3,id4,id5);
  }

  private native void DrawImage_30(float id0,float id1,vtkImageData id2);
  public void DrawImage(float id0,float id1,vtkImageData id2)
  {
    DrawImage_30(id0,id1,id2);
  }

  private native void DrawImage_31(float id0,float id1,float id2,vtkImageData id3);
  public void DrawImage(float id0,float id1,float id2,vtkImageData id3)
  {
    DrawImage_31(id0,id1,id2,id3);
  }

  private native void DrawPolyData_32(float id0,float id1,vtkPolyData id2,vtkUnsignedCharArray id3,int id4);
  public void DrawPolyData(float id0,float id1,vtkPolyData id2,vtkUnsignedCharArray id3,int id4)
  {
    DrawPolyData_32(id0,id1,id2,id3,id4);
  }

  private native void DrawStringRect_33(vtkPoints2D id0,byte[] id1, int len1);
  public void DrawStringRect(vtkPoints2D id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    DrawStringRect_33(id0,bytes1, bytes1.length);
  }

  private native void DrawStringRect_34(float id0[],byte[] id1, int len1);
  public void DrawStringRect(float id0[],String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    DrawStringRect_34(id0,bytes1, bytes1.length);
  }

  private native void DrawString_35(vtkPoints2D id0,byte[] id1, int len1);
  public void DrawString(vtkPoints2D id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    DrawString_35(id0,bytes1, bytes1.length);
  }

  private native void DrawString_36(float id0,float id1,byte[] id2, int len2);
  public void DrawString(float id0,float id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    DrawString_36(id0,id1,bytes2, bytes2.length);
  }

  private native void ComputeStringBounds_37(byte[] id0, int len0,vtkPoints2D id1);
  public void ComputeStringBounds(String id0,vtkPoints2D id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeStringBounds_37(bytes0, bytes0.length,id1);
  }

  private native void ComputeStringBounds_38(byte[] id0, int len0,float id1[]);
  public void ComputeStringBounds(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeStringBounds_38(bytes0, bytes0.length,id1);
  }

  private native void ComputeJustifiedStringBounds_39(byte[] id0, int len0,float id1[]);
  public void ComputeJustifiedStringBounds(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeJustifiedStringBounds_39(bytes0, bytes0.length,id1);
  }

  private native int ComputeFontSizeForBoundedString_40(byte[] id0, int len0,float id1,float id2);
  public int ComputeFontSizeForBoundedString(String id0,float id1,float id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ComputeFontSizeForBoundedString_40(bytes0, bytes0.length,id1,id2);
  }

  private native void DrawMathTextString_41(vtkPoints2D id0,byte[] id1, int len1);
  public void DrawMathTextString(vtkPoints2D id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    DrawMathTextString_41(id0,bytes1, bytes1.length);
  }

  private native void DrawMathTextString_42(float id0,float id1,byte[] id2, int len2);
  public void DrawMathTextString(float id0,float id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    DrawMathTextString_42(id0,id1,bytes2, bytes2.length);
  }

  private native void DrawMathTextString_43(vtkPoints2D id0,byte[] id1, int len1,byte[] id2, int len2);
  public void DrawMathTextString(vtkPoints2D id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    DrawMathTextString_43(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native void DrawMathTextString_44(float id0,float id1,byte[] id2, int len2,byte[] id3, int len3);
  public void DrawMathTextString(float id0,float id1,String id2,String id3)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    DrawMathTextString_44(id0,id1,bytes2, bytes2.length,bytes3, bytes3.length);
  }

  private native boolean MathTextIsSupported_45();
  public boolean MathTextIsSupported()
  {
    return MathTextIsSupported_45();
  }

  private native void ApplyPen_46(vtkPen id0);
  public void ApplyPen(vtkPen id0)
  {
    ApplyPen_46(id0);
  }

  private native long GetPen_47();
  public vtkPen GetPen()
  {
    long temp = GetPen_47();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ApplyBrush_48(vtkBrush id0);
  public void ApplyBrush(vtkBrush id0)
  {
    ApplyBrush_48(id0);
  }

  private native long GetBrush_49();
  public vtkBrush GetBrush()
  {
    long temp = GetBrush_49();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ApplyTextProp_50(vtkTextProperty id0);
  public void ApplyTextProp(vtkTextProperty id0)
  {
    ApplyTextProp_50(id0);
  }

  private native long GetTextProp_51();
  public vtkTextProperty GetTextProp()
  {
    long temp = GetTextProp_51();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransform_52(vtkTransform2D id0);
  public void SetTransform(vtkTransform2D id0)
  {
    SetTransform_52(id0);
  }

  private native long GetTransform_53();
  public vtkTransform2D GetTransform()
  {
    long temp = GetTransform_53();

    if (temp == 0) return null;
    return (vtkTransform2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AppendTransform_54(vtkTransform2D id0);
  public void AppendTransform(vtkTransform2D id0)
  {
    AppendTransform_54(id0);
  }

  private native void PushMatrix_55();
  public void PushMatrix()
  {
    PushMatrix_55();
  }

  private native void PopMatrix_56();
  public void PopMatrix()
  {
    PopMatrix_56();
  }

  private native void ApplyId_57(long id0);
  public void ApplyId(long id0)
  {
    ApplyId_57(id0);
  }

  private native int FloatToInt_58(float id0);
  public int FloatToInt(float id0)
  {
    return FloatToInt_58(id0);
  }

  private native long GetContext3D_59();
  public vtkContext3D GetContext3D()
  {
    long temp = GetContext3D_59();

    if (temp == 0) return null;
    return (vtkContext3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetContext3D_60(vtkContext3D id0);
  public void SetContext3D(vtkContext3D id0)
  {
    SetContext3D_60(id0);
  }

  public vtkContext2D() { super(); }

  public vtkContext2D(long id) { super(id); }
  public native long   VTKInit();

}
