// java wrapper for vtkSVGExporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSVGExporter extends vtkExporter
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

  private native void SetTitle_4(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_4(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_5();
  public String GetTitle()
  {
    return new String(GetTitle_5(), StandardCharsets.UTF_8);
  }

  private native void SetDescription_6(byte[] id0, int len0);
  public void SetDescription(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDescription_6(bytes0, bytes0.length);
  }

  private native byte[] GetDescription_7();
  public String GetDescription()
  {
    return new String(GetDescription_7(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_8(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_8(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_9();
  public String GetFileName()
  {
    return new String(GetFileName_9(), StandardCharsets.UTF_8);
  }

  private native void SetTextAsPath_10(boolean id0);
  public void SetTextAsPath(boolean id0)
  {
    SetTextAsPath_10(id0);
  }

  private native boolean GetTextAsPath_11();
  public boolean GetTextAsPath()
  {
    return GetTextAsPath_11();
  }

  private native void TextAsPathOn_12();
  public void TextAsPathOn()
  {
    TextAsPathOn_12();
  }

  private native void TextAsPathOff_13();
  public void TextAsPathOff()
  {
    TextAsPathOff_13();
  }

  private native void SetDrawBackground_14(boolean id0);
  public void SetDrawBackground(boolean id0)
  {
    SetDrawBackground_14(id0);
  }

  private native boolean GetDrawBackground_15();
  public boolean GetDrawBackground()
  {
    return GetDrawBackground_15();
  }

  private native void DrawBackgroundOn_16();
  public void DrawBackgroundOn()
  {
    DrawBackgroundOn_16();
  }

  private native void DrawBackgroundOff_17();
  public void DrawBackgroundOff()
  {
    DrawBackgroundOff_17();
  }

  private native void SetSubdivisionThreshold_18(float id0);
  public void SetSubdivisionThreshold(float id0)
  {
    SetSubdivisionThreshold_18(id0);
  }

  private native float GetSubdivisionThreshold_19();
  public float GetSubdivisionThreshold()
  {
    return GetSubdivisionThreshold_19();
  }

  public vtkSVGExporter() { super(); }

  public vtkSVGExporter(long id) { super(id); }
  public native long   VTKInit();

}
