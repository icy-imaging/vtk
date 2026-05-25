// java wrapper for vtkTIFFReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTIFFReader extends vtkImageReader2
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

  private native void SetOrientationType_7(int id0);
  public void SetOrientationType(int id0)
  {
    SetOrientationType_7(id0);
  }

  private native int GetOrientationType_8();
  public int GetOrientationType()
  {
    return GetOrientationType_8();
  }

  private native boolean GetOrientationTypeSpecifiedFlag_9();
  public boolean GetOrientationTypeSpecifiedFlag()
  {
    return GetOrientationTypeSpecifiedFlag_9();
  }

  private native void SetOriginSpecifiedFlag_10(boolean id0);
  public void SetOriginSpecifiedFlag(boolean id0)
  {
    SetOriginSpecifiedFlag_10(id0);
  }

  private native boolean GetOriginSpecifiedFlag_11();
  public boolean GetOriginSpecifiedFlag()
  {
    return GetOriginSpecifiedFlag_11();
  }

  private native void OriginSpecifiedFlagOn_12();
  public void OriginSpecifiedFlagOn()
  {
    OriginSpecifiedFlagOn_12();
  }

  private native void OriginSpecifiedFlagOff_13();
  public void OriginSpecifiedFlagOff()
  {
    OriginSpecifiedFlagOff_13();
  }

  private native void SetSpacingSpecifiedFlag_14(boolean id0);
  public void SetSpacingSpecifiedFlag(boolean id0)
  {
    SetSpacingSpecifiedFlag_14(id0);
  }

  private native boolean GetSpacingSpecifiedFlag_15();
  public boolean GetSpacingSpecifiedFlag()
  {
    return GetSpacingSpecifiedFlag_15();
  }

  private native void SpacingSpecifiedFlagOn_16();
  public void SpacingSpecifiedFlagOn()
  {
    SpacingSpecifiedFlagOn_16();
  }

  private native void SpacingSpecifiedFlagOff_17();
  public void SpacingSpecifiedFlagOff()
  {
    SpacingSpecifiedFlagOff_17();
  }

  private native void SetIgnoreColorMap_18(boolean id0);
  public void SetIgnoreColorMap(boolean id0)
  {
    SetIgnoreColorMap_18(id0);
  }

  private native boolean GetIgnoreColorMap_19();
  public boolean GetIgnoreColorMap()
  {
    return GetIgnoreColorMap_19();
  }

  private native void IgnoreColorMapOn_20();
  public void IgnoreColorMapOn()
  {
    IgnoreColorMapOn_20();
  }

  private native void IgnoreColorMapOff_21();
  public void IgnoreColorMapOff()
  {
    IgnoreColorMapOff_21();
  }

  public vtkTIFFReader() { super(); }

  public vtkTIFFReader(long id) { super(id); }
  public native long   VTKInit();

}
