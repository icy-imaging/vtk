// java wrapper for vtkExtractSelectedArraysOverTime object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractSelectedArraysOverTime extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetSelectionConnection_5(vtkAlgorithmOutput id0);
  public void SetSelectionConnection(vtkAlgorithmOutput id0)
  {
    SetSelectionConnection_5(id0);
  }

  private native void SetSelectionExtractor_6(vtkExtractSelection id0);
  public void SetSelectionExtractor(vtkExtractSelection id0)
  {
    SetSelectionExtractor_6(id0);
  }

  private native long GetSelectionExtractor_7();
  public vtkExtractSelection GetSelectionExtractor()
  {
    long temp = GetSelectionExtractor_7();

    if (temp == 0) return null;
    return (vtkExtractSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetReportStatisticsOnly_8(boolean id0);
  public void SetReportStatisticsOnly(boolean id0)
  {
    SetReportStatisticsOnly_8(id0);
  }

  private native boolean GetReportStatisticsOnly_9();
  public boolean GetReportStatisticsOnly()
  {
    return GetReportStatisticsOnly_9();
  }

  private native void ReportStatisticsOnlyOn_10();
  public void ReportStatisticsOnlyOn()
  {
    ReportStatisticsOnlyOn_10();
  }

  private native void ReportStatisticsOnlyOff_11();
  public void ReportStatisticsOnlyOff()
  {
    ReportStatisticsOnlyOff_11();
  }

  public vtkExtractSelectedArraysOverTime() { super(); }

  public vtkExtractSelectedArraysOverTime(long id) { super(id); }
  public native long   VTKInit();

}
