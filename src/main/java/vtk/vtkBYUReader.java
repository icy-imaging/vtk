// java wrapper for vtkBYUReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBYUReader extends vtkPolyDataAlgorithm
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

  private native void SetDisplacementFileName_8(byte[] id0, int len0);
  public void SetDisplacementFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDisplacementFileName_8(bytes0, bytes0.length);
  }

  private native byte[] GetDisplacementFileName_9();
  public String GetDisplacementFileName()
  {
    return new String(GetDisplacementFileName_9(), StandardCharsets.UTF_8);
  }

  private native void SetScalarFileName_10(byte[] id0, int len0);
  public void SetScalarFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarFileName_10(bytes0, bytes0.length);
  }

  private native byte[] GetScalarFileName_11();
  public String GetScalarFileName()
  {
    return new String(GetScalarFileName_11(), StandardCharsets.UTF_8);
  }

  private native void SetTextureFileName_12(byte[] id0, int len0);
  public void SetTextureFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTextureFileName_12(bytes0, bytes0.length);
  }

  private native byte[] GetTextureFileName_13();
  public String GetTextureFileName()
  {
    return new String(GetTextureFileName_13(), StandardCharsets.UTF_8);
  }

  private native void SetReadDisplacement_14(int id0);
  public void SetReadDisplacement(int id0)
  {
    SetReadDisplacement_14(id0);
  }

  private native int GetReadDisplacement_15();
  public int GetReadDisplacement()
  {
    return GetReadDisplacement_15();
  }

  private native void ReadDisplacementOn_16();
  public void ReadDisplacementOn()
  {
    ReadDisplacementOn_16();
  }

  private native void ReadDisplacementOff_17();
  public void ReadDisplacementOff()
  {
    ReadDisplacementOff_17();
  }

  private native void SetReadScalar_18(int id0);
  public void SetReadScalar(int id0)
  {
    SetReadScalar_18(id0);
  }

  private native int GetReadScalar_19();
  public int GetReadScalar()
  {
    return GetReadScalar_19();
  }

  private native void ReadScalarOn_20();
  public void ReadScalarOn()
  {
    ReadScalarOn_20();
  }

  private native void ReadScalarOff_21();
  public void ReadScalarOff()
  {
    ReadScalarOff_21();
  }

  private native void SetReadTexture_22(int id0);
  public void SetReadTexture(int id0)
  {
    SetReadTexture_22(id0);
  }

  private native int GetReadTexture_23();
  public int GetReadTexture()
  {
    return GetReadTexture_23();
  }

  private native void ReadTextureOn_24();
  public void ReadTextureOn()
  {
    ReadTextureOn_24();
  }

  private native void ReadTextureOff_25();
  public void ReadTextureOff()
  {
    ReadTextureOff_25();
  }

  private native void SetPartNumber_26(int id0);
  public void SetPartNumber(int id0)
  {
    SetPartNumber_26(id0);
  }

  private native int GetPartNumberMinValue_27();
  public int GetPartNumberMinValue()
  {
    return GetPartNumberMinValue_27();
  }

  private native int GetPartNumberMaxValue_28();
  public int GetPartNumberMaxValue()
  {
    return GetPartNumberMaxValue_28();
  }

  private native int GetPartNumber_29();
  public int GetPartNumber()
  {
    return GetPartNumber_29();
  }

  private native int CanReadFile_30(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_30(bytes0, bytes0.length);
  }

  public vtkBYUReader() { super(); }

  public vtkBYUReader(long id) { super(id); }
  public native long   VTKInit();

}
