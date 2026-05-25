// java wrapper for vtkDescriptiveStatistics object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDescriptiveStatistics extends vtkStatisticsAlgorithm
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

  private native void SetSampleEstimate_4(boolean id0);
  public void SetSampleEstimate(boolean id0)
  {
    SetSampleEstimate_4(id0);
  }

  private native boolean GetSampleEstimate_5();
  public boolean GetSampleEstimate()
  {
    return GetSampleEstimate_5();
  }

  private native void SampleEstimateOn_6();
  public void SampleEstimateOn()
  {
    SampleEstimateOn_6();
  }

  private native void SampleEstimateOff_7();
  public void SampleEstimateOff()
  {
    SampleEstimateOff_7();
  }

  private native void SetSignedDeviations_8(int id0);
  public void SetSignedDeviations(int id0)
  {
    SetSignedDeviations_8(id0);
  }

  private native int GetSignedDeviations_9();
  public int GetSignedDeviations()
  {
    return GetSignedDeviations_9();
  }

  private native void SignedDeviationsOn_10();
  public void SignedDeviationsOn()
  {
    SignedDeviationsOn_10();
  }

  private native void SignedDeviationsOff_11();
  public void SignedDeviationsOff()
  {
    SignedDeviationsOff_11();
  }

  private native void SetGhostsToSkip_12(byte id0);
  public void SetGhostsToSkip(byte id0)
  {
    SetGhostsToSkip_12(id0);
  }

  private native byte GetGhostsToSkip_13();
  public byte GetGhostsToSkip()
  {
    return GetGhostsToSkip_13();
  }

  private native void Aggregate_14(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1);
  public void Aggregate(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1)
  {
    Aggregate_14(id0,id1);
  }

  public vtkDescriptiveStatistics() { super(); }

  public vtkDescriptiveStatistics(long id) { super(id); }
  public native long   VTKInit();

}
