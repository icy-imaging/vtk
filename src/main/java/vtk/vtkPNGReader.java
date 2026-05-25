// java wrapper for vtkPNGReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPNGReader extends vtkImageReader2
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

  private native int CanReadFile_4(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileExtensions_5();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_5(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_6();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_6(), StandardCharsets.UTF_8);
  }

  private native void GetTextChunks_7(byte[] id0, int len0,int id1[]);
  public void GetTextChunks(String id0,int id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    GetTextChunks_7(bytes0, bytes0.length,id1);
  }

  private native byte[] GetTextKey_8(int id0);
  public String GetTextKey(int id0)
  {
    return new String(GetTextKey_8(id0), StandardCharsets.UTF_8);
  }

  private native long GetTextKeys_9();
  public vtkStringArray GetTextKeys()
  {
    long temp = GetTextKeys_9();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetTextValue_10(int id0);
  public String GetTextValue(int id0)
  {
    return new String(GetTextValue_10(id0), StandardCharsets.UTF_8);
  }

  private native long GetTextValues_11();
  public vtkStringArray GetTextValues()
  {
    long temp = GetTextValues_11();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetReadSpacingFromFile_12(boolean id0);
  public void SetReadSpacingFromFile(boolean id0)
  {
    SetReadSpacingFromFile_12(id0);
  }

  private native boolean GetReadSpacingFromFile_13();
  public boolean GetReadSpacingFromFile()
  {
    return GetReadSpacingFromFile_13();
  }

  private native void ReadSpacingFromFileOn_14();
  public void ReadSpacingFromFileOn()
  {
    ReadSpacingFromFileOn_14();
  }

  private native void ReadSpacingFromFileOff_15();
  public void ReadSpacingFromFileOff()
  {
    ReadSpacingFromFileOff_15();
  }

  public vtkPNGReader() { super(); }

  public vtkPNGReader(long id) { super(id); }
  public native long   VTKInit();

}
