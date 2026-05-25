// java wrapper for vtkImageWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageWriter extends vtkImageAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetFilePrefix_6(byte[] id0, int len0);
  public void SetFilePrefix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePrefix_6(bytes0, bytes0.length);
  }

  private native byte[] GetFilePrefix_7();
  public String GetFilePrefix()
  {
    return new String(GetFilePrefix_7(), StandardCharsets.UTF_8);
  }

  private native void SetFilePattern_8(byte[] id0, int len0);
  public void SetFilePattern(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePattern_8(bytes0, bytes0.length);
  }

  private native byte[] GetFilePattern_9();
  public String GetFilePattern()
  {
    return new String(GetFilePattern_9(), StandardCharsets.UTF_8);
  }

  private native void SetFileDimensionality_10(int id0);
  public void SetFileDimensionality(int id0)
  {
    SetFileDimensionality_10(id0);
  }

  private native int GetFileDimensionality_11();
  public int GetFileDimensionality()
  {
    return GetFileDimensionality_11();
  }

  private native long GetInput_12();
  public vtkImageData GetInput()
  {
    long temp = GetInput_12();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Write_13();
  public void Write()
  {
    Write_13();
  }

  private native void DeleteFiles_14();
  public void DeleteFiles()
  {
    DeleteFiles_14();
  }

  public vtkImageWriter() { super(); }

  public vtkImageWriter(long id) { super(id); }
  public native long   VTKInit();

}
