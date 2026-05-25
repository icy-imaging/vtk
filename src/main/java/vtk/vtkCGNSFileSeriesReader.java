// java wrapper for vtkCGNSFileSeriesReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCGNSFileSeriesReader extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetController_4(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_4(id0);
  }

  private native long GetController_5();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_5();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetReader_6(vtkCGNSReader id0);
  public void SetReader(vtkCGNSReader id0)
  {
    SetReader_6(id0);
  }

  private native long GetReader_7();
  public vtkCGNSReader GetReader()
  {
    long temp = GetReader_7();

    if (temp == 0) return null;
    return (vtkCGNSReader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CanReadFile_8(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_8(bytes0, bytes0.length);
  }

  private native void AddFileName_9(byte[] id0, int len0);
  public void AddFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddFileName_9(bytes0, bytes0.length);
  }

  private native void RemoveAllFileNames_10();
  public void RemoveAllFileNames()
  {
    RemoveAllFileNames_10();
  }

  private native boolean GetIgnoreReaderTime_11();
  public boolean GetIgnoreReaderTime()
  {
    return GetIgnoreReaderTime_11();
  }

  private native void SetIgnoreReaderTime_12(boolean id0);
  public void SetIgnoreReaderTime(boolean id0)
  {
    SetIgnoreReaderTime_12(id0);
  }

  private native void IgnoreReaderTimeOn_13();
  public void IgnoreReaderTimeOn()
  {
    IgnoreReaderTimeOn_13();
  }

  private native void IgnoreReaderTimeOff_14();
  public void IgnoreReaderTimeOff()
  {
    IgnoreReaderTimeOff_14();
  }

  private native byte[] GetCurrentFileName_15();
  public String GetCurrentFileName()
  {
    return new String(GetCurrentFileName_15(), StandardCharsets.UTF_8);
  }

  public vtkCGNSFileSeriesReader() { super(); }

  public vtkCGNSFileSeriesReader(long id) { super(id); }
  public native long   VTKInit();

}
