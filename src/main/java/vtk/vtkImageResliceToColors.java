// java wrapper for vtkImageResliceToColors object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageResliceToColors extends vtkImageReslice
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

  private native int GetOutputFormatMinValue_7();
  public int GetOutputFormatMinValue()
  {
    return GetOutputFormatMinValue_7();
  }

  private native int GetOutputFormatMaxValue_8();
  public int GetOutputFormatMaxValue()
  {
    return GetOutputFormatMaxValue_8();
  }

  private native int GetOutputFormat_9();
  public int GetOutputFormat()
  {
    return GetOutputFormat_9();
  }

  private native void SetOutputFormatToRGBA_10();
  public void SetOutputFormatToRGBA()
  {
    SetOutputFormatToRGBA_10();
  }

  private native void SetOutputFormatToRGB_11();
  public void SetOutputFormatToRGB()
  {
    SetOutputFormatToRGB_11();
  }

  private native void SetOutputFormatToLuminanceAlpha_12();
  public void SetOutputFormatToLuminanceAlpha()
  {
    SetOutputFormatToLuminanceAlpha_12();
  }

  private native void SetOutputFormatToLuminance_13();
  public void SetOutputFormatToLuminance()
  {
    SetOutputFormatToLuminance_13();
  }

  private native void SetBypass_14(int id0);
  public void SetBypass(int id0)
  {
    SetBypass_14(id0);
  }

  private native void BypassOn_15();
  public void BypassOn()
  {
    BypassOn_15();
  }

  private native void BypassOff_16();
  public void BypassOff()
  {
    BypassOff_16();
  }

  private native int GetBypass_17();
  public int GetBypass()
  {
    return GetBypass_17();
  }

  private native long GetMTime_18();
  public long GetMTime()
  {
    return GetMTime_18();
  }

  public vtkImageResliceToColors() { super(); }

  public vtkImageResliceToColors(long id) { super(id); }
  public native long   VTKInit();

}
