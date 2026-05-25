// java wrapper for vtkExtractDataArraysOverTime object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractDataArraysOverTime extends vtkMultiBlockDataSetAlgorithm
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

  private native int GetNumberOfTimeSteps_4();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_4();
  }

  private native void SetFieldAssociation_5(int id0);
  public void SetFieldAssociation(int id0)
  {
    SetFieldAssociation_5(id0);
  }

  private native int GetFieldAssociationMinValue_6();
  public int GetFieldAssociationMinValue()
  {
    return GetFieldAssociationMinValue_6();
  }

  private native int GetFieldAssociationMaxValue_7();
  public int GetFieldAssociationMaxValue()
  {
    return GetFieldAssociationMaxValue_7();
  }

  private native int GetFieldAssociation_8();
  public int GetFieldAssociation()
  {
    return GetFieldAssociation_8();
  }

  private native void SetReportStatisticsOnly_9(boolean id0);
  public void SetReportStatisticsOnly(boolean id0)
  {
    SetReportStatisticsOnly_9(id0);
  }

  private native boolean GetReportStatisticsOnly_10();
  public boolean GetReportStatisticsOnly()
  {
    return GetReportStatisticsOnly_10();
  }

  private native void ReportStatisticsOnlyOn_11();
  public void ReportStatisticsOnlyOn()
  {
    ReportStatisticsOnlyOn_11();
  }

  private native void ReportStatisticsOnlyOff_12();
  public void ReportStatisticsOnlyOff()
  {
    ReportStatisticsOnlyOff_12();
  }

  private native void SetUseGlobalIDs_13(boolean id0);
  public void SetUseGlobalIDs(boolean id0)
  {
    SetUseGlobalIDs_13(id0);
  }

  private native boolean GetUseGlobalIDs_14();
  public boolean GetUseGlobalIDs()
  {
    return GetUseGlobalIDs_14();
  }

  public vtkExtractDataArraysOverTime() { super(); }

  public vtkExtractDataArraysOverTime(long id) { super(id); }
  public native long   VTKInit();

}
