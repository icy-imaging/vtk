// java wrapper for vtkSVGContextDevice2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSVGContextDevice2D extends vtkContextDevice2D
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

  private native void SetSVGContext_4(vtkXMLDataElement id0,vtkXMLDataElement id1);
  public void SetSVGContext(vtkXMLDataElement id0,vtkXMLDataElement id1)
  {
    SetSVGContext_4(id0,id1);
  }

  private native void SetEmbedFonts_5(boolean id0);
  public void SetEmbedFonts(boolean id0)
  {
    SetEmbedFonts_5(id0);
  }

  private native boolean GetEmbedFonts_6();
  public boolean GetEmbedFonts()
  {
    return GetEmbedFonts_6();
  }

  private native void EmbedFontsOn_7();
  public void EmbedFontsOn()
  {
    EmbedFontsOn_7();
  }

  private native void EmbedFontsOff_8();
  public void EmbedFontsOff()
  {
    EmbedFontsOff_8();
  }

  private native void SetTextAsPath_9(boolean id0);
  public void SetTextAsPath(boolean id0)
  {
    SetTextAsPath_9(id0);
  }

  private native boolean GetTextAsPath_10();
  public boolean GetTextAsPath()
  {
    return GetTextAsPath_10();
  }

  private native void TextAsPathOn_11();
  public void TextAsPathOn()
  {
    TextAsPathOn_11();
  }

  private native void TextAsPathOff_12();
  public void TextAsPathOff()
  {
    TextAsPathOff_12();
  }

  private native void SetSubdivisionThreshold_13(float id0);
  public void SetSubdivisionThreshold(float id0)
  {
    SetSubdivisionThreshold_13(id0);
  }

  private native float GetSubdivisionThreshold_14();
  public float GetSubdivisionThreshold()
  {
    return GetSubdivisionThreshold_14();
  }

  private native void GenerateDefinitions_15();
  public void GenerateDefinitions()
  {
    GenerateDefinitions_15();
  }

  private native void Begin_16(vtkViewport id0);
  public void Begin(vtkViewport id0)
  {
    Begin_16(id0);
  }

  private native void End_17();
  public void End()
  {
    End_17();
  }

  private native void DrawEllipseWedge_18(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7);
  public void DrawEllipseWedge(float id0,float id1,float id2,float id3,float id4,float id5,float id6,float id7)
  {
    DrawEllipseWedge_18(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void DrawEllipticArc_19(float id0,float id1,float id2,float id3,float id4,float id5);
  public void DrawEllipticArc(float id0,float id1,float id2,float id3,float id4,float id5)
  {
    DrawEllipticArc_19(id0,id1,id2,id3,id4,id5);
  }

  private native void ComputeStringBounds_20(byte[] id0, int len0,float id1[]);
  public void ComputeStringBounds(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeStringBounds_20(bytes0, bytes0.length,id1);
  }

  private native void ComputeJustifiedStringBounds_21(byte[] id0, int len0,float id1[]);
  public void ComputeJustifiedStringBounds(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ComputeJustifiedStringBounds_21(bytes0, bytes0.length,id1);
  }

  private native void DrawImage_22(float id0[],float id1,vtkImageData id2);
  public void DrawImage(float id0[],float id1,vtkImageData id2)
  {
    DrawImage_22(id0,id1,id2);
  }

  private native void SetTexture_23(vtkImageData id0,int id1);
  public void SetTexture(vtkImageData id0,int id1)
  {
    SetTexture_23(id0,id1);
  }

  private native void SetPointSize_24(float id0);
  public void SetPointSize(float id0)
  {
    SetPointSize_24(id0);
  }

  private native void SetLineWidth_25(float id0);
  public void SetLineWidth(float id0)
  {
    SetLineWidth_25(id0);
  }

  private native void SetLineType_26(int id0);
  public void SetLineType(int id0)
  {
    SetLineType_26(id0);
  }

  private native void SetMatrix_27(vtkMatrix3x3 id0);
  public void SetMatrix(vtkMatrix3x3 id0)
  {
    SetMatrix_27(id0);
  }

  private native void GetMatrix_28(vtkMatrix3x3 id0);
  public void GetMatrix(vtkMatrix3x3 id0)
  {
    GetMatrix_28(id0);
  }

  private native void MultiplyMatrix_29(vtkMatrix3x3 id0);
  public void MultiplyMatrix(vtkMatrix3x3 id0)
  {
    MultiplyMatrix_29(id0);
  }

  private native void PushMatrix_30();
  public void PushMatrix()
  {
    PushMatrix_30();
  }

  private native void PopMatrix_31();
  public void PopMatrix()
  {
    PopMatrix_31();
  }

  private native void EnableClipping_32(boolean id0);
  public void EnableClipping(boolean id0)
  {
    EnableClipping_32(id0);
  }

  public vtkSVGContextDevice2D() { super(); }

  public vtkSVGContextDevice2D(long id) { super(id); }
  public native long   VTKInit();

}
