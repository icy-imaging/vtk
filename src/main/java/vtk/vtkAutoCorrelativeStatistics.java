// java wrapper for vtkAutoCorrelativeStatistics object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAutoCorrelativeStatistics extends vtkStatisticsAlgorithm
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

  private native void SetSliceCardinality_4(long id0);
  public void SetSliceCardinality(long id0)
  {
    SetSliceCardinality_4(id0);
  }

  private native long GetSliceCardinalityMinValue_5();
  public long GetSliceCardinalityMinValue()
  {
    return GetSliceCardinalityMinValue_5();
  }

  private native long GetSliceCardinalityMaxValue_6();
  public long GetSliceCardinalityMaxValue()
  {
    return GetSliceCardinalityMaxValue_6();
  }

  private native long GetSliceCardinality_7();
  public long GetSliceCardinality()
  {
    return GetSliceCardinality_7();
  }

  private native void Aggregate_8(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1);
  public void Aggregate(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1)
  {
    Aggregate_8(id0,id1);
  }

  public vtkAutoCorrelativeStatistics() { super(); }

  public vtkAutoCorrelativeStatistics(long id) { super(id); }
  public native long   VTKInit();

}
