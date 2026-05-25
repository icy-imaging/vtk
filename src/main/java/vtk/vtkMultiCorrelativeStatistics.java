// java wrapper for vtkMultiCorrelativeStatistics object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiCorrelativeStatistics extends vtkStatisticsAlgorithm
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

  private native void Aggregate_4(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1);
  public void Aggregate(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1)
  {
    Aggregate_4(id0,id1);
  }

  private native void SetMedianAbsoluteDeviation_5(boolean id0);
  public void SetMedianAbsoluteDeviation(boolean id0)
  {
    SetMedianAbsoluteDeviation_5(id0);
  }

  private native boolean GetMedianAbsoluteDeviation_6();
  public boolean GetMedianAbsoluteDeviation()
  {
    return GetMedianAbsoluteDeviation_6();
  }

  private native void MedianAbsoluteDeviationOn_7();
  public void MedianAbsoluteDeviationOn()
  {
    MedianAbsoluteDeviationOn_7();
  }

  private native void MedianAbsoluteDeviationOff_8();
  public void MedianAbsoluteDeviationOff()
  {
    MedianAbsoluteDeviationOff_8();
  }

  private native void SetGhostsToSkip_9(byte id0);
  public void SetGhostsToSkip(byte id0)
  {
    SetGhostsToSkip_9(id0);
  }

  private native byte GetGhostsToSkip_10();
  public byte GetGhostsToSkip()
  {
    return GetGhostsToSkip_10();
  }

  public vtkMultiCorrelativeStatistics() { super(); }

  public vtkMultiCorrelativeStatistics(long id) { super(id); }
  public native long   VTKInit();

}
