// java wrapper for vtkImageMapToColors object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageMapToColors extends vtkThreadedImageAlgorithm
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

  private native void SetLookupTable_4(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_4(id0);
  }

  private native long GetLookupTable_5();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_5();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputFormat_6(int id0);
  public void SetOutputFormat(int id0)
  {
    SetOutputFormat_6(id0);
  }

  private native int GetOutputFormat_7();
  public int GetOutputFormat()
  {
    return GetOutputFormat_7();
  }

  private native void SetOutputFormatToRGBA_8();
  public void SetOutputFormatToRGBA()
  {
    SetOutputFormatToRGBA_8();
  }

  private native void SetOutputFormatToRGB_9();
  public void SetOutputFormatToRGB()
  {
    SetOutputFormatToRGB_9();
  }

  private native void SetOutputFormatToLuminanceAlpha_10();
  public void SetOutputFormatToLuminanceAlpha()
  {
    SetOutputFormatToLuminanceAlpha_10();
  }

  private native void SetOutputFormatToLuminance_11();
  public void SetOutputFormatToLuminance()
  {
    SetOutputFormatToLuminance_11();
  }

  private native void SetActiveComponent_12(int id0);
  public void SetActiveComponent(int id0)
  {
    SetActiveComponent_12(id0);
  }

  private native int GetActiveComponent_13();
  public int GetActiveComponent()
  {
    return GetActiveComponent_13();
  }

  private native void SetPassAlphaToOutput_14(int id0);
  public void SetPassAlphaToOutput(int id0)
  {
    SetPassAlphaToOutput_14(id0);
  }

  private native void PassAlphaToOutputOn_15();
  public void PassAlphaToOutputOn()
  {
    PassAlphaToOutputOn_15();
  }

  private native void PassAlphaToOutputOff_16();
  public void PassAlphaToOutputOff()
  {
    PassAlphaToOutputOff_16();
  }

  private native int GetPassAlphaToOutput_17();
  public int GetPassAlphaToOutput()
  {
    return GetPassAlphaToOutput_17();
  }

  private native long GetMTime_18();
  public long GetMTime()
  {
    return GetMTime_18();
  }

  private native void SetNaNColor_19(byte id0,byte id1,byte id2,byte id3);
  public void SetNaNColor(byte id0,byte id1,byte id2,byte id3)
  {
    SetNaNColor_19(id0,id1,id2,id3);
  }

  private native byte[]  GetNaNColor_20();
  public byte[]  GetNaNColor()
  {
    return GetNaNColor_20();
  }

  public vtkImageMapToColors() { super(); }

  public vtkImageMapToColors(long id) { super(id); }
  public native long   VTKInit();

}
