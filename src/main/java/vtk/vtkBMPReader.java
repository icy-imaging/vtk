// java wrapper for vtkBMPReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBMPReader extends vtkImageReader
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

  private native int GetDepth_4();
  public int GetDepth()
  {
    return GetDepth_4();
  }

  private native int CanReadFile_5(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_5(bytes0, bytes0.length);
  }

  private native byte[] GetFileExtensions_6();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_6(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_7();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_7(), StandardCharsets.UTF_8);
  }

  private native void SetAllow8BitBMP_8(int id0);
  public void SetAllow8BitBMP(int id0)
  {
    SetAllow8BitBMP_8(id0);
  }

  private native int GetAllow8BitBMP_9();
  public int GetAllow8BitBMP()
  {
    return GetAllow8BitBMP_9();
  }

  private native void Allow8BitBMPOn_10();
  public void Allow8BitBMPOn()
  {
    Allow8BitBMPOn_10();
  }

  private native void Allow8BitBMPOff_11();
  public void Allow8BitBMPOff()
  {
    Allow8BitBMPOff_11();
  }

  private native long GetLookupTable_12();
  public vtkLookupTable GetLookupTable()
  {
    long temp = GetLookupTable_12();

    if (temp == 0) return null;
    return (vtkLookupTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkBMPReader() { super(); }

  public vtkBMPReader(long id) { super(id); }
  public native long   VTKInit();

}
