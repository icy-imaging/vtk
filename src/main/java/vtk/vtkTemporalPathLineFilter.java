// java wrapper for vtkTemporalPathLineFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTemporalPathLineFilter extends vtkPolyDataAlgorithm
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

  private native byte[] TimeStepsArrayName_4();
  public String TimeStepsArrayName()
  {
    return new String(TimeStepsArrayName_4(), StandardCharsets.UTF_8);
  }

  private native void SetMaskPoints_5(int id0);
  public void SetMaskPoints(int id0)
  {
    SetMaskPoints_5(id0);
  }

  private native int GetMaskPoints_6();
  public int GetMaskPoints()
  {
    return GetMaskPoints_6();
  }

  private native void SetMaxTrackLength_7(int id0);
  public void SetMaxTrackLength(int id0)
  {
    SetMaxTrackLength_7(id0);
  }

  private native int GetMaxTrackLength_8();
  public int GetMaxTrackLength()
  {
    return GetMaxTrackLength_8();
  }

  private native void SetIdChannelArray_9(byte[] id0, int len0);
  public void SetIdChannelArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIdChannelArray_9(bytes0, bytes0.length);
  }

  private native byte[] GetIdChannelArray_10();
  public String GetIdChannelArray()
  {
    return new String(GetIdChannelArray_10(), StandardCharsets.UTF_8);
  }

  private native void SetMaxStepDistance_11(double id0,double id1,double id2);
  public void SetMaxStepDistance(double id0,double id1,double id2)
  {
    SetMaxStepDistance_11(id0,id1,id2);
  }

  private native void SetMaxStepDistance_12(double id0[]);
  public void SetMaxStepDistance(double id0[])
  {
    SetMaxStepDistance_12(id0);
  }

  private native double[] GetMaxStepDistance_13();
  public double[] GetMaxStepDistance()
  {
    return GetMaxStepDistance_13();
  }

  private native void SetKeepDeadTrails_14(boolean id0);
  public void SetKeepDeadTrails(boolean id0)
  {
    SetKeepDeadTrails_14(id0);
  }

  private native boolean GetKeepDeadTrails_15();
  public boolean GetKeepDeadTrails()
  {
    return GetKeepDeadTrails_15();
  }

  private native void SetBackwardTime_16(boolean id0);
  public void SetBackwardTime(boolean id0)
  {
    SetBackwardTime_16(id0);
  }

  private native boolean GetBackwardTime_17();
  public boolean GetBackwardTime()
  {
    return GetBackwardTime_17();
  }

  private native void Flush_18();
  public void Flush()
  {
    Flush_18();
  }

  private native void SetSelectionConnection_19(vtkAlgorithmOutput id0);
  public void SetSelectionConnection(vtkAlgorithmOutput id0)
  {
    SetSelectionConnection_19(id0);
  }

  private native void SetSelectionData_20(vtkDataSet id0);
  public void SetSelectionData(vtkDataSet id0)
  {
    SetSelectionData_20(id0);
  }

  public vtkTemporalPathLineFilter() { super(); }

  public vtkTemporalPathLineFilter(long id) { super(id); }
  public native long   VTKInit();

}
