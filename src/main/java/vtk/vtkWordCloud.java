// java wrapper for vtkWordCloud object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWordCloud extends vtkImageAlgorithm
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

  private native void SetBackgroundColorName_4(byte[] id0, int len0);
  public void SetBackgroundColorName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBackgroundColorName_4(bytes0, bytes0.length);
  }

  private native byte[] GetBackgroundColorName_5();
  public String GetBackgroundColorName()
  {
    return new String(GetBackgroundColorName_5(), StandardCharsets.UTF_8);
  }

  private native void SetBWMask_6(boolean id0);
  public void SetBWMask(boolean id0)
  {
    SetBWMask_6(id0);
  }

  private native boolean GetBWMask_7();
  public boolean GetBWMask()
  {
    return GetBWMask_7();
  }

  private native void SetColorSchemeName_8(byte[] id0, int len0);
  public void SetColorSchemeName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColorSchemeName_8(bytes0, bytes0.length);
  }

  private native byte[] GetColorSchemeName_9();
  public String GetColorSchemeName()
  {
    return new String(GetColorSchemeName_9(), StandardCharsets.UTF_8);
  }

  private native void SetDPI_10(int id0);
  public void SetDPI(int id0)
  {
    SetDPI_10(id0);
  }

  private native int GetDPI_11();
  public int GetDPI()
  {
    return GetDPI_11();
  }

  private native void SetFileName_12(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_12(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_13();
  public String GetFileName()
  {
    return new String(GetFileName_13(), StandardCharsets.UTF_8);
  }

  private native void SetFontFileName_14(byte[] id0, int len0);
  public void SetFontFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFontFileName_14(bytes0, bytes0.length);
  }

  private native byte[] GetFontFileName_15();
  public String GetFontFileName()
  {
    return new String(GetFontFileName_15(), StandardCharsets.UTF_8);
  }

  private native void SetGap_16(int id0);
  public void SetGap(int id0)
  {
    SetGap_16(id0);
  }

  private native int GetGap_17();
  public int GetGap()
  {
    return GetGap_17();
  }

  private native void SetMaskColorName_18(byte[] id0, int len0);
  public void SetMaskColorName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMaskColorName_18(bytes0, bytes0.length);
  }

  private native byte[] GetMaskColorName_19();
  public String GetMaskColorName()
  {
    return new String(GetMaskColorName_19(), StandardCharsets.UTF_8);
  }

  private native void SetMaskFileName_20(byte[] id0, int len0);
  public void SetMaskFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMaskFileName_20(bytes0, bytes0.length);
  }

  private native byte[] GetMaskFileName_21();
  public String GetMaskFileName()
  {
    return new String(GetMaskFileName_21(), StandardCharsets.UTF_8);
  }

  private native void SetMaxFontSize_22(int id0);
  public void SetMaxFontSize(int id0)
  {
    SetMaxFontSize_22(id0);
  }

  private native int GetMaxFontSize_23();
  public int GetMaxFontSize()
  {
    return GetMaxFontSize_23();
  }

  private native void SetMinFontSize_24(int id0);
  public void SetMinFontSize(int id0)
  {
    SetMinFontSize_24(id0);
  }

  private native int GetMinFontSize_25();
  public int GetMinFontSize()
  {
    return GetMinFontSize_25();
  }

  private native void SetMinFrequency_26(int id0);
  public void SetMinFrequency(int id0)
  {
    SetMinFrequency_26(id0);
  }

  private native int GetMinFrequency_27();
  public int GetMinFrequency()
  {
    return GetMinFrequency_27();
  }

  private native void SetFontMultiplier_28(int id0);
  public void SetFontMultiplier(int id0)
  {
    SetFontMultiplier_28(id0);
  }

  private native int GetFontMultiplier_29();
  public int GetFontMultiplier()
  {
    return GetFontMultiplier_29();
  }

  private native void AddOrientation_30(double id0);
  public void AddOrientation(double id0)
  {
    AddOrientation_30(id0);
  }

  private native void AddStopWord_31(byte[] id0, int len0);
  public void AddStopWord(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddStopWord_31(bytes0, bytes0.length);
  }

  private native void ClearStopWords_32();
  public void ClearStopWords()
  {
    ClearStopWords_32();
  }

  private native void SetStopListFileName_33(byte[] id0, int len0);
  public void SetStopListFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStopListFileName_33(bytes0, bytes0.length);
  }

  private native byte[] GetStopListFileName_34();
  public String GetStopListFileName()
  {
    return new String(GetStopListFileName_34(), StandardCharsets.UTF_8);
  }

  private native void SetTitle_35(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_35(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_36();
  public String GetTitle()
  {
    return new String(GetTitle_36(), StandardCharsets.UTF_8);
  }

  private native void SetWordColorName_37(byte[] id0, int len0);
  public void SetWordColorName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWordColorName_37(bytes0, bytes0.length);
  }

  private native byte[] GetWordColorName_38();
  public String GetWordColorName()
  {
    return new String(GetWordColorName_38(), StandardCharsets.UTF_8);
  }

  public vtkWordCloud() { super(); }

  public vtkWordCloud(long id) { super(id); }
  public native long   VTKInit();

}
