// java wrapper for vtkSTLWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSTLWriter extends vtkWriter
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

  private native long GetInput_4();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_4();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_5(int id0);
  public vtkPolyData GetInput(int id0)
  {
    long temp = GetInput_5(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileName_6(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_7();
  public String GetFileName()
  {
    return new String(GetFileName_7(), StandardCharsets.UTF_8);
  }

  private native void SetHeader_8(byte[] id0, int len0);
  public void SetHeader(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetHeader_8(bytes0, bytes0.length);
  }

  private native byte[] GetHeader_9();
  public String GetHeader()
  {
    return new String(GetHeader_9(), StandardCharsets.UTF_8);
  }

  private native void SetBinaryHeader_10(vtkUnsignedCharArray id0);
  public void SetBinaryHeader(vtkUnsignedCharArray id0)
  {
    SetBinaryHeader_10(id0);
  }

  private native long GetBinaryHeader_11();
  public vtkUnsignedCharArray GetBinaryHeader()
  {
    long temp = GetBinaryHeader_11();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileType_12(int id0);
  public void SetFileType(int id0)
  {
    SetFileType_12(id0);
  }

  private native int GetFileTypeMinValue_13();
  public int GetFileTypeMinValue()
  {
    return GetFileTypeMinValue_13();
  }

  private native int GetFileTypeMaxValue_14();
  public int GetFileTypeMaxValue()
  {
    return GetFileTypeMaxValue_14();
  }

  private native int GetFileType_15();
  public int GetFileType()
  {
    return GetFileType_15();
  }

  private native void SetFileTypeToASCII_16();
  public void SetFileTypeToASCII()
  {
    SetFileTypeToASCII_16();
  }

  private native void SetFileTypeToBinary_17();
  public void SetFileTypeToBinary()
  {
    SetFileTypeToBinary_17();
  }

  public vtkSTLWriter() { super(); }

  public vtkSTLWriter(long id) { super(id); }
  public native long   VTKInit();

}
