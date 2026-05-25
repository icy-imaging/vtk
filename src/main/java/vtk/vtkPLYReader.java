// java wrapper for vtkPLYReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPLYReader extends vtkAbstractPolyDataReader
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

  private native long GetComments_5();
  public vtkStringArray GetComments()
  {
    long temp = GetComments_5();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native float GetFaceTextureTolerance_6();
  public float GetFaceTextureTolerance()
  {
    return GetFaceTextureTolerance_6();
  }

  private native void SetFaceTextureTolerance_7(float id0);
  public void SetFaceTextureTolerance(float id0)
  {
    SetFaceTextureTolerance_7(id0);
  }

  private native void SetReadFromInputString_8(boolean id0);
  public void SetReadFromInputString(boolean id0)
  {
    SetReadFromInputString_8(id0);
  }

  private native boolean GetReadFromInputString_9();
  public boolean GetReadFromInputString()
  {
    return GetReadFromInputString_9();
  }

  private native void ReadFromInputStringOn_10();
  public void ReadFromInputStringOn()
  {
    ReadFromInputStringOn_10();
  }

  private native void ReadFromInputStringOff_11();
  public void ReadFromInputStringOff()
  {
    ReadFromInputStringOff_11();
  }

  private native void SetInputString_12(byte[] id0, int len0);
  public void SetInputString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputString_12(bytes0, bytes0.length);
  }

  private native void SetStream_13(vtkResourceStream id0);
  public void SetStream(vtkResourceStream id0)
  {
    SetStream_13(id0);
  }

  private native long GetStream_14();
  public vtkResourceStream GetStream()
  {
    long temp = GetStream_14();

    if (temp == 0) return null;
    return (vtkResourceStream)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetReadFromInputStream_15(boolean id0);
  public void SetReadFromInputStream(boolean id0)
  {
    SetReadFromInputStream_15(id0);
  }

  private native boolean GetReadFromInputStream_16();
  public boolean GetReadFromInputStream()
  {
    return GetReadFromInputStream_16();
  }

  private native void ReadFromInputStreamOn_17();
  public void ReadFromInputStreamOn()
  {
    ReadFromInputStreamOn_17();
  }

  private native void ReadFromInputStreamOff_18();
  public void ReadFromInputStreamOff()
  {
    ReadFromInputStreamOff_18();
  }

  private native boolean GetDuplicatePointsForFaceTexture_19();
  public boolean GetDuplicatePointsForFaceTexture()
  {
    return GetDuplicatePointsForFaceTexture_19();
  }

  private native void SetDuplicatePointsForFaceTexture_20(boolean id0);
  public void SetDuplicatePointsForFaceTexture(boolean id0)
  {
    SetDuplicatePointsForFaceTexture_20(id0);
  }

  public vtkPLYReader() { super(); }

  public vtkPLYReader(long id) { super(id); }
  public native long   VTKInit();

}
