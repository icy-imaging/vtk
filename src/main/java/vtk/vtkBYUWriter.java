// java wrapper for vtkBYUWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBYUWriter extends vtkWriter
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

  private native void SetGeometryFileName_4(byte[] id0, int len0);
  public void SetGeometryFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGeometryFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetGeometryFileName_5();
  public String GetGeometryFileName()
  {
    return new String(GetGeometryFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetDisplacementFileName_6(byte[] id0, int len0);
  public void SetDisplacementFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDisplacementFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetDisplacementFileName_7();
  public String GetDisplacementFileName()
  {
    return new String(GetDisplacementFileName_7(), StandardCharsets.UTF_8);
  }

  private native void SetScalarFileName_8(byte[] id0, int len0);
  public void SetScalarFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarFileName_8(bytes0, bytes0.length);
  }

  private native byte[] GetScalarFileName_9();
  public String GetScalarFileName()
  {
    return new String(GetScalarFileName_9(), StandardCharsets.UTF_8);
  }

  private native void SetTextureFileName_10(byte[] id0, int len0);
  public void SetTextureFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTextureFileName_10(bytes0, bytes0.length);
  }

  private native byte[] GetTextureFileName_11();
  public String GetTextureFileName()
  {
    return new String(GetTextureFileName_11(), StandardCharsets.UTF_8);
  }

  private native void SetWriteDisplacement_12(int id0);
  public void SetWriteDisplacement(int id0)
  {
    SetWriteDisplacement_12(id0);
  }

  private native int GetWriteDisplacement_13();
  public int GetWriteDisplacement()
  {
    return GetWriteDisplacement_13();
  }

  private native void WriteDisplacementOn_14();
  public void WriteDisplacementOn()
  {
    WriteDisplacementOn_14();
  }

  private native void WriteDisplacementOff_15();
  public void WriteDisplacementOff()
  {
    WriteDisplacementOff_15();
  }

  private native void SetWriteScalar_16(int id0);
  public void SetWriteScalar(int id0)
  {
    SetWriteScalar_16(id0);
  }

  private native int GetWriteScalar_17();
  public int GetWriteScalar()
  {
    return GetWriteScalar_17();
  }

  private native void WriteScalarOn_18();
  public void WriteScalarOn()
  {
    WriteScalarOn_18();
  }

  private native void WriteScalarOff_19();
  public void WriteScalarOff()
  {
    WriteScalarOff_19();
  }

  private native void SetWriteTexture_20(int id0);
  public void SetWriteTexture(int id0)
  {
    SetWriteTexture_20(id0);
  }

  private native int GetWriteTexture_21();
  public int GetWriteTexture()
  {
    return GetWriteTexture_21();
  }

  private native void WriteTextureOn_22();
  public void WriteTextureOn()
  {
    WriteTextureOn_22();
  }

  private native void WriteTextureOff_23();
  public void WriteTextureOff()
  {
    WriteTextureOff_23();
  }

  private native long GetInput_24();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_24();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_25(int id0);
  public vtkPolyData GetInput(int id0)
  {
    long temp = GetInput_25(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkBYUWriter() { super(); }

  public vtkBYUWriter(long id) { super(id); }
  public native long   VTKInit();

}
