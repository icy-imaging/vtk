// java wrapper for vtkHighestDensityRegionsStatistics object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHighestDensityRegionsStatistics extends vtkStatisticsAlgorithm
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

  private native void SetSigma_5(double id0);
  public void SetSigma(double id0)
  {
    SetSigma_5(id0);
  }

  private native void SetSigmaMatrix_6(double id0,double id1,double id2,double id3);
  public void SetSigmaMatrix(double id0,double id1,double id2,double id3)
  {
    SetSigmaMatrix_6(id0,id1,id2,id3);
  }

  private native double ComputeHDR_7(vtkDataArray id0,vtkDataArray id1);
  public double ComputeHDR(vtkDataArray id0,vtkDataArray id1)
  {
    return ComputeHDR_7(id0,id1);
  }

  private native double ComputeHDR_8(vtkDataArray id0,vtkDataArray id1,vtkDataArray id2);
  public double ComputeHDR(vtkDataArray id0,vtkDataArray id1,vtkDataArray id2)
  {
    return ComputeHDR_8(id0,id1,id2);
  }

  public vtkHighestDensityRegionsStatistics() { super(); }

  public vtkHighestDensityRegionsStatistics(long id) { super(id); }
  public native long   VTKInit();

}
