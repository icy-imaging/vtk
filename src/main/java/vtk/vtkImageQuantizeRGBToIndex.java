// java wrapper for vtkImageQuantizeRGBToIndex object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageQuantizeRGBToIndex extends vtkImageAlgorithm
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

  private native void SetNumberOfColors_4(int id0);
  public void SetNumberOfColors(int id0)
  {
    SetNumberOfColors_4(id0);
  }

  private native int GetNumberOfColorsMinValue_5();
  public int GetNumberOfColorsMinValue()
  {
    return GetNumberOfColorsMinValue_5();
  }

  private native int GetNumberOfColorsMaxValue_6();
  public int GetNumberOfColorsMaxValue()
  {
    return GetNumberOfColorsMaxValue_6();
  }

  private native int GetNumberOfColors_7();
  public int GetNumberOfColors()
  {
    return GetNumberOfColors_7();
  }

  private native void SetSamplingRate_8(int id0,int id1,int id2);
  public void SetSamplingRate(int id0,int id1,int id2)
  {
    SetSamplingRate_8(id0,id1,id2);
  }

  private native void SetSamplingRate_9(int id0[]);
  public void SetSamplingRate(int id0[])
  {
    SetSamplingRate_9(id0);
  }

  private native int[] GetSamplingRate_10();
  public int[] GetSamplingRate()
  {
    return GetSamplingRate_10();
  }

  private native void SetSortIndexByLuminance_11(boolean id0);
  public void SetSortIndexByLuminance(boolean id0)
  {
    SetSortIndexByLuminance_11(id0);
  }

  private native boolean GetSortIndexByLuminance_12();
  public boolean GetSortIndexByLuminance()
  {
    return GetSortIndexByLuminance_12();
  }

  private native void SortIndexByLuminanceOn_13();
  public void SortIndexByLuminanceOn()
  {
    SortIndexByLuminanceOn_13();
  }

  private native void SortIndexByLuminanceOff_14();
  public void SortIndexByLuminanceOff()
  {
    SortIndexByLuminanceOff_14();
  }

  private native long GetLookupTable_15();
  public vtkLookupTable GetLookupTable()
  {
    long temp = GetLookupTable_15();

    if (temp == 0) return null;
    return (vtkLookupTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetInitializeExecuteTime_16();
  public double GetInitializeExecuteTime()
  {
    return GetInitializeExecuteTime_16();
  }

  private native double GetBuildTreeExecuteTime_17();
  public double GetBuildTreeExecuteTime()
  {
    return GetBuildTreeExecuteTime_17();
  }

  private native double GetLookupIndexExecuteTime_18();
  public double GetLookupIndexExecuteTime()
  {
    return GetLookupIndexExecuteTime_18();
  }

  private native int GetInputType_19();
  public int GetInputType()
  {
    return GetInputType_19();
  }

  private native void SetInitializeExecuteTime_20(double id0);
  public void SetInitializeExecuteTime(double id0)
  {
    SetInitializeExecuteTime_20(id0);
  }

  private native void SetBuildTreeExecuteTime_21(double id0);
  public void SetBuildTreeExecuteTime(double id0)
  {
    SetBuildTreeExecuteTime_21(id0);
  }

  private native void SetLookupIndexExecuteTime_22(double id0);
  public void SetLookupIndexExecuteTime(double id0)
  {
    SetLookupIndexExecuteTime_22(id0);
  }

  public vtkImageQuantizeRGBToIndex() { super(); }

  public vtkImageQuantizeRGBToIndex(long id) { super(id); }
  public native long   VTKInit();

}
