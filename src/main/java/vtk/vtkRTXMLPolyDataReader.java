// java wrapper for vtkRTXMLPolyDataReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRTXMLPolyDataReader extends vtkXMLPolyDataReader
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

  private native void SetLocation_4(byte[] id0, int len0);
  public void SetLocation(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLocation_4(bytes0, bytes0.length);
  }

  private native byte[] GetDataLocation_5();
  public String GetDataLocation()
  {
    return new String(GetDataLocation_5(), StandardCharsets.UTF_8);
  }

  private native void UpdateToNextFile_6();
  public void UpdateToNextFile()
  {
    UpdateToNextFile_6();
  }

  private native int NewDataAvailable_7();
  public int NewDataAvailable()
  {
    return NewDataAvailable_7();
  }

  private native void ResetReader_8();
  public void ResetReader()
  {
    ResetReader_8();
  }

  private native byte[] GetNextFileName_9();
  public String GetNextFileName()
  {
    return new String(GetNextFileName_9(), StandardCharsets.UTF_8);
  }

  public vtkRTXMLPolyDataReader() { super(); }

  public vtkRTXMLPolyDataReader(long id) { super(id); }
  public native long   VTKInit();

}
