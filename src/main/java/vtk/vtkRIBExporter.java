// java wrapper for vtkRIBExporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRIBExporter extends vtkExporter
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

  private native void SetSize_4(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_4(id0,id1);
  }

  private native void SetSize_5(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_5(id0);
  }

  private native int[] GetSize_6();
  public int[] GetSize()
  {
    return GetSize_6();
  }

  private native void SetPixelSamples_7(int id0,int id1);
  public void SetPixelSamples(int id0,int id1)
  {
    SetPixelSamples_7(id0,id1);
  }

  private native void SetPixelSamples_8(int id0[]);
  public void SetPixelSamples(int id0[])
  {
    SetPixelSamples_8(id0);
  }

  private native int[] GetPixelSamples_9();
  public int[] GetPixelSamples()
  {
    return GetPixelSamples_9();
  }

  private native void SetFilePrefix_10(byte[] id0, int len0);
  public void SetFilePrefix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePrefix_10(bytes0, bytes0.length);
  }

  private native byte[] GetFilePrefix_11();
  public String GetFilePrefix()
  {
    return new String(GetFilePrefix_11(), StandardCharsets.UTF_8);
  }

  private native void SetTexturePrefix_12(byte[] id0, int len0);
  public void SetTexturePrefix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTexturePrefix_12(bytes0, bytes0.length);
  }

  private native byte[] GetTexturePrefix_13();
  public String GetTexturePrefix()
  {
    return new String(GetTexturePrefix_13(), StandardCharsets.UTF_8);
  }

  private native void SetBackground_14(int id0);
  public void SetBackground(int id0)
  {
    SetBackground_14(id0);
  }

  private native int GetBackground_15();
  public int GetBackground()
  {
    return GetBackground_15();
  }

  private native void BackgroundOn_16();
  public void BackgroundOn()
  {
    BackgroundOn_16();
  }

  private native void BackgroundOff_17();
  public void BackgroundOff()
  {
    BackgroundOff_17();
  }

  private native void SetExportArrays_18(int id0);
  public void SetExportArrays(int id0)
  {
    SetExportArrays_18(id0);
  }

  private native int GetExportArraysMinValue_19();
  public int GetExportArraysMinValue()
  {
    return GetExportArraysMinValue_19();
  }

  private native int GetExportArraysMaxValue_20();
  public int GetExportArraysMaxValue()
  {
    return GetExportArraysMaxValue_20();
  }

  private native void ExportArraysOn_21();
  public void ExportArraysOn()
  {
    ExportArraysOn_21();
  }

  private native void ExportArraysOff_22();
  public void ExportArraysOff()
  {
    ExportArraysOff_22();
  }

  private native int GetExportArrays_23();
  public int GetExportArrays()
  {
    return GetExportArrays_23();
  }

  public vtkRIBExporter() { super(); }

  public vtkRIBExporter(long id) { super(id); }
  public native long   VTKInit();

}
