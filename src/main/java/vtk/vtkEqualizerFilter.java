// java wrapper for vtkEqualizerFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEqualizerFilter extends vtkTableAlgorithm
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

  private native void SetSamplingFrequency_4(int id0);
  public void SetSamplingFrequency(int id0)
  {
    SetSamplingFrequency_4(id0);
  }

  private native int GetSamplingFrequency_5();
  public int GetSamplingFrequency()
  {
    return GetSamplingFrequency_5();
  }

  private native void SetAllColumns_6(boolean id0);
  public void SetAllColumns(boolean id0)
  {
    SetAllColumns_6(id0);
  }

  private native boolean GetAllColumns_7();
  public boolean GetAllColumns()
  {
    return GetAllColumns_7();
  }

  private native void SetArray_8(byte[] id0, int len0);
  public void SetArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArray_8(bytes0, bytes0.length);
  }

  private native byte[] GetArray_9();
  public String GetArray()
  {
    return new String(GetArray_9(), StandardCharsets.UTF_8);
  }

  private native void SetPoints_10(byte[] id0, int len0);
  public void SetPoints(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPoints_10(bytes0, bytes0.length);
  }

  private native byte[] GetPoints_11();
  public String GetPoints()
  {
    return new String(GetPoints_11(), StandardCharsets.UTF_8);
  }

  private native void SetSpectrumGain_12(int id0);
  public void SetSpectrumGain(int id0)
  {
    SetSpectrumGain_12(id0);
  }

  private native int GetSpectrumGain_13();
  public int GetSpectrumGain()
  {
    return GetSpectrumGain_13();
  }

  public vtkEqualizerFilter() { super(); }

  public vtkEqualizerFilter(long id) { super(id); }
  public native long   VTKInit();

}
