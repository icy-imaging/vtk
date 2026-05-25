// java wrapper for vtkPDFContextDevice2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPDFContextDevice2D extends vtkContextDevice2D
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

  private native void SetRenderer_4(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_4(id0);
  }

  private native void DrawEllipseWedge_5(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7);
  public void DrawEllipseWedge(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7)
  {
    DrawEllipseWedge_5(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void DrawEllipticArc_6(float id0,float id1,float id2,float id3,float id4,float id5);
  public void DrawEllipticArc(float id0,float id1,float id2,float id3,float id4,float id5)
  {
    DrawEllipticArc_6(id0,id1,id2,id3,id4,id5);
  }

  private native void ComputeStringBounds_7(byte[] id0, int len0,float id1[]);
  public void ComputeStringBounds(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeStringBounds_7(bytes0, bytes0.length,id1);
  }

  private native void ComputeJustifiedStringBounds_8(byte[] id0, int len0,float id1[]);
  public void ComputeJustifiedStringBounds(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeJustifiedStringBounds_8(bytes0, bytes0.length,id1);
  }

  private native void DrawImage_9(float id0[],float id1,vtkImageData id2);
  public void DrawImage(float id0[],float id1,vtkImageData id2)
  {
    DrawImage_9(id0,id1,id2);
  }

  private native void SetTexture_10(vtkImageData id0,int id1);
  public void SetTexture(vtkImageData id0,int id1)
  {
    SetTexture_10(id0,id1);
  }

  private native void SetPointSize_11(float id0);
  public void SetPointSize(float id0)
  {
    SetPointSize_11(id0);
  }

  private native void SetLineWidth_12(float id0);
  public void SetLineWidth(float id0)
  {
    SetLineWidth_12(id0);
  }

  private native void DrawPolyData_13(float id0[],float id1,vtkPolyData id2,vtkUnsignedCharArray id3,int id4);
  public void DrawPolyData(float id0[],float id1,vtkPolyData id2,vtkUnsignedCharArray id3,int id4)
  {
    DrawPolyData_13(id0,id1,id2,id3,id4);
  }

  private native void SetLineType_14(int id0);
  public void SetLineType(int id0)
  {
    SetLineType_14(id0);
  }

  private native void SetMatrix_15(vtkMatrix3x3 id0);
  public void SetMatrix(vtkMatrix3x3 id0)
  {
    SetMatrix_15(id0);
  }

  private native void GetMatrix_16(vtkMatrix3x3 id0);
  public void GetMatrix(vtkMatrix3x3 id0)
  {
    GetMatrix_16(id0);
  }

  private native void MultiplyMatrix_17(vtkMatrix3x3 id0);
  public void MultiplyMatrix(vtkMatrix3x3 id0)
  {
    MultiplyMatrix_17(id0);
  }

  private native void PushMatrix_18();
  public void PushMatrix()
  {
    PushMatrix_18();
  }

  private native void PopMatrix_19();
  public void PopMatrix()
  {
    PopMatrix_19();
  }

  private native void EnableClipping_20(boolean id0);
  public void EnableClipping(boolean id0)
  {
    EnableClipping_20(id0);
  }

  public vtkPDFContextDevice2D() { super(); }

  public vtkPDFContextDevice2D(long id) { super(id); }
  public native long   VTKInit();

}
