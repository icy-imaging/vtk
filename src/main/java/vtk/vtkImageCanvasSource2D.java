// java wrapper for vtkImageCanvasSource2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageCanvasSource2D extends vtkImageAlgorithm
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

  private native void SetDrawColor_4(double id0,double id1,double id2,double id3);
  public void SetDrawColor(double id0,double id1,double id2,double id3)
  {
    SetDrawColor_4(id0,id1,id2,id3);
  }

  private native void SetDrawColor_5(double id0[]);
  public void SetDrawColor(double id0[])
  {
    SetDrawColor_5(id0);
  }

  private native double[] GetDrawColor_6();
  public double[] GetDrawColor()
  {
    return GetDrawColor_6();
  }

  private native void SetDrawColor_7(double id0);
  public void SetDrawColor(double id0)
  {
    SetDrawColor_7(id0);
  }

  private native void SetDrawColor_8(double id0,double id1);
  public void SetDrawColor(double id0,double id1)
  {
    SetDrawColor_8(id0,id1);
  }

  private native void SetDrawColor_9(double id0,double id1,double id2);
  public void SetDrawColor(double id0,double id1,double id2)
  {
    SetDrawColor_9(id0,id1,id2);
  }

  private native void InitializeCanvasVolume_10(vtkImageData id0);
  public void InitializeCanvasVolume(vtkImageData id0)
  {
    InitializeCanvasVolume_10(id0);
  }

  private native void FillBox_11(int id0,int id1,int id2,int id3);
  public void FillBox(int id0,int id1,int id2,int id3)
  {
    FillBox_11(id0,id1,id2,id3);
  }

  private native void FillTube_12(int id0,int id1,int id2,int id3,double id4);
  public void FillTube(int id0,int id1,int id2,int id3,double id4)
  {
    FillTube_12(id0,id1,id2,id3,id4);
  }

  private native void FillTriangle_13(int id0,int id1,int id2,int id3,int id4,int id5);
  public void FillTriangle(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    FillTriangle_13(id0,id1,id2,id3,id4,id5);
  }

  private native void DrawCircle_14(int id0,int id1,double id2);
  public void DrawCircle(int id0,int id1,double id2)
  {
    DrawCircle_14(id0,id1,id2);
  }

  private native void DrawPoint_15(int id0,int id1);
  public void DrawPoint(int id0,int id1)
  {
    DrawPoint_15(id0,id1);
  }

  private native void DrawSegment_16(int id0,int id1,int id2,int id3);
  public void DrawSegment(int id0,int id1,int id2,int id3)
  {
    DrawSegment_16(id0,id1,id2,id3);
  }

  private native void DrawSegment3D_17(double id0,double id1,double id2,double id3,double id4,double id5);
  public void DrawSegment3D(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    DrawSegment3D_17(id0,id1,id2,id3,id4,id5);
  }

  private native void DrawImage_18(int id0,int id1,vtkImageData id2);
  public void DrawImage(int id0,int id1,vtkImageData id2)
  {
    DrawImage_18(id0,id1,id2);
  }

  private native void DrawImage_19(int id0,int id1,vtkImageData id2,int id3,int id4,int id5,int id6);
  public void DrawImage(int id0,int id1,vtkImageData id2,int id3,int id4,int id5,int id6)
  {
    DrawImage_19(id0,id1,id2,id3,id4,id5,id6);
  }

  private native void FillPixel_20(int id0,int id1);
  public void FillPixel(int id0,int id1)
  {
    FillPixel_20(id0,id1);
  }

  private native void SetExtent_21(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_21(id0,id1,id2,id3,id4,id5);
  }

  private native void SetDefaultZ_22(int id0);
  public void SetDefaultZ(int id0)
  {
    SetDefaultZ_22(id0);
  }

  private native int GetDefaultZ_23();
  public int GetDefaultZ()
  {
    return GetDefaultZ_23();
  }

  private native void SetRatio_24(double id0,double id1,double id2);
  public void SetRatio(double id0,double id1,double id2)
  {
    SetRatio_24(id0,id1,id2);
  }

  private native void SetRatio_25(double id0[]);
  public void SetRatio(double id0[])
  {
    SetRatio_25(id0);
  }

  private native double[] GetRatio_26();
  public double[] GetRatio()
  {
    return GetRatio_26();
  }

  private native void SetNumberOfScalarComponents_27(int id0);
  public void SetNumberOfScalarComponents(int id0)
  {
    SetNumberOfScalarComponents_27(id0);
  }

  private native int GetNumberOfScalarComponents_28();
  public int GetNumberOfScalarComponents()
  {
    return GetNumberOfScalarComponents_28();
  }

  private native void SetScalarTypeToFloat_29();
  public void SetScalarTypeToFloat()
  {
    SetScalarTypeToFloat_29();
  }

  private native void SetScalarTypeToDouble_30();
  public void SetScalarTypeToDouble()
  {
    SetScalarTypeToDouble_30();
  }

  private native void SetScalarTypeToInt_31();
  public void SetScalarTypeToInt()
  {
    SetScalarTypeToInt_31();
  }

  private native void SetScalarTypeToUnsignedInt_32();
  public void SetScalarTypeToUnsignedInt()
  {
    SetScalarTypeToUnsignedInt_32();
  }

  private native void SetScalarTypeToLong_33();
  public void SetScalarTypeToLong()
  {
    SetScalarTypeToLong_33();
  }

  private native void SetScalarTypeToUnsignedLong_34();
  public void SetScalarTypeToUnsignedLong()
  {
    SetScalarTypeToUnsignedLong_34();
  }

  private native void SetScalarTypeToShort_35();
  public void SetScalarTypeToShort()
  {
    SetScalarTypeToShort_35();
  }

  private native void SetScalarTypeToUnsignedShort_36();
  public void SetScalarTypeToUnsignedShort()
  {
    SetScalarTypeToUnsignedShort_36();
  }

  private native void SetScalarTypeToUnsignedChar_37();
  public void SetScalarTypeToUnsignedChar()
  {
    SetScalarTypeToUnsignedChar_37();
  }

  private native void SetScalarTypeToChar_38();
  public void SetScalarTypeToChar()
  {
    SetScalarTypeToChar_38();
  }

  private native void SetScalarType_39(int id0);
  public void SetScalarType(int id0)
  {
    SetScalarType_39(id0);
  }

  private native int GetScalarType_40();
  public int GetScalarType()
  {
    return GetScalarType_40();
  }

  public vtkImageCanvasSource2D() { super(); }

  public vtkImageCanvasSource2D(long id) { super(id); }
  public native long   VTKInit();

}
