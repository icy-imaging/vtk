// java wrapper for vtkOrderStatistics object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOrderStatistics extends vtkStatisticsAlgorithm
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

  private native void SetNumberOfIntervals_4(long id0);
  public void SetNumberOfIntervals(long id0)
  {
    SetNumberOfIntervals_4(id0);
  }

  private native long GetNumberOfIntervals_5();
  public long GetNumberOfIntervals()
  {
    return GetNumberOfIntervals_5();
  }

  private native void SetQuantileDefinition_6(int id0);
  public void SetQuantileDefinition(int id0)
  {
    SetQuantileDefinition_6(id0);
  }

  private native void SetQuantize_7(boolean id0);
  public void SetQuantize(boolean id0)
  {
    SetQuantize_7(id0);
  }

  private native boolean GetQuantize_8();
  public boolean GetQuantize()
  {
    return GetQuantize_8();
  }

  private native void SetMaximumHistogramSize_9(long id0);
  public void SetMaximumHistogramSize(long id0)
  {
    SetMaximumHistogramSize_9(id0);
  }

  private native long GetMaximumHistogramSize_10();
  public long GetMaximumHistogramSize()
  {
    return GetMaximumHistogramSize_10();
  }

  private native long GetQuantileDefinition_11();
  public long GetQuantileDefinition()
  {
    return GetQuantileDefinition_11();
  }

  private native void Aggregate_12(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1);
  public void Aggregate(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1)
  {
    Aggregate_12(id0,id1);
  }

  private native void SetGhostsToSkip_13(byte id0);
  public void SetGhostsToSkip(byte id0)
  {
    SetGhostsToSkip_13(id0);
  }

  private native byte GetGhostsToSkip_14();
  public byte GetGhostsToSkip()
  {
    return GetGhostsToSkip_14();
  }

  public vtkOrderStatistics() { super(); }

  public vtkOrderStatistics(long id) { super(id); }
  public native long   VTKInit();

}
