// java wrapper for vtkISIReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkISIReader extends vtkTableAlgorithm
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

  private native byte[] GetFileName_4();
  public String GetFileName()
  {
    return new String(GetFileName_4(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native byte[] GetDelimiter_6();
  public String GetDelimiter()
  {
    return new String(GetDelimiter_6(), StandardCharsets.UTF_8);
  }

  private native void SetDelimiter_7(byte[] id0, int len0);
  public void SetDelimiter(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDelimiter_7(bytes0, bytes0.length);
  }

  private native int GetMaxRecords_8();
  public int GetMaxRecords()
  {
    return GetMaxRecords_8();
  }

  private native void SetMaxRecords_9(int id0);
  public void SetMaxRecords(int id0)
  {
    SetMaxRecords_9(id0);
  }

  public vtkISIReader() { super(); }

  public vtkISIReader(long id) { super(id); }
  public native long   VTKInit();

}
