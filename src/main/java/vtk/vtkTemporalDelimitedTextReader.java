// java wrapper for vtkTemporalDelimitedTextReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTemporalDelimitedTextReader extends vtkDelimitedTextReader
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

  private native byte[] GetTimeColumnName_4();
  public String GetTimeColumnName()
  {
    return new String(GetTimeColumnName_4(), StandardCharsets.UTF_8);
  }

  private native void SetTimeColumnName_5(byte[] id0, int len0);
  public void SetTimeColumnName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTimeColumnName_5(bytes0, bytes0.length);
  }

  private native int GetTimeColumnId_6();
  public int GetTimeColumnId()
  {
    return GetTimeColumnId_6();
  }

  private native void SetTimeColumnId_7(int id0);
  public void SetTimeColumnId(int id0)
  {
    SetTimeColumnId_7(id0);
  }

  private native boolean GetRemoveTimeStepColumn_8();
  public boolean GetRemoveTimeStepColumn()
  {
    return GetRemoveTimeStepColumn_8();
  }

  private native void SetRemoveTimeStepColumn_9(boolean id0);
  public void SetRemoveTimeStepColumn(boolean id0)
  {
    SetRemoveTimeStepColumn_9(id0);
  }

  private native long GetMTime_10();
  public long GetMTime()
  {
    return GetMTime_10();
  }

  public vtkTemporalDelimitedTextReader() { super(); }

  public vtkTemporalDelimitedTextReader(long id) { super(id); }
  public native long   VTKInit();

}
