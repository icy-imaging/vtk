// java wrapper for vtkNIFTIImageWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNIFTIImageWriter extends vtkImageWriter
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

  private native void SetNIFTIVersion_4(int id0);
  public void SetNIFTIVersion(int id0)
  {
    SetNIFTIVersion_4(id0);
  }

  private native int GetNIFTIVersion_5();
  public int GetNIFTIVersion()
  {
    return GetNIFTIVersion_5();
  }

  private native void SetDescription_6(byte[] id0, int len0);
  public void SetDescription(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDescription_6(bytes0, bytes0.length);
  }

  private native byte[] GetDescription_7();
  public String GetDescription()
  {
    return new String(GetDescription_7(), StandardCharsets.UTF_8);
  }

  private native int GetTimeDimension_8();
  public int GetTimeDimension()
  {
    return GetTimeDimension_8();
  }

  private native void SetTimeDimension_9(int id0);
  public void SetTimeDimension(int id0)
  {
    SetTimeDimension_9(id0);
  }

  private native double GetTimeSpacing_10();
  public double GetTimeSpacing()
  {
    return GetTimeSpacing_10();
  }

  private native void SetTimeSpacing_11(double id0);
  public void SetTimeSpacing(double id0)
  {
    SetTimeSpacing_11(id0);
  }

  private native void SetRescaleSlope_12(double id0);
  public void SetRescaleSlope(double id0)
  {
    SetRescaleSlope_12(id0);
  }

  private native double GetRescaleSlope_13();
  public double GetRescaleSlope()
  {
    return GetRescaleSlope_13();
  }

  private native void SetRescaleIntercept_14(double id0);
  public void SetRescaleIntercept(double id0)
  {
    SetRescaleIntercept_14(id0);
  }

  private native double GetRescaleIntercept_15();
  public double GetRescaleIntercept()
  {
    return GetRescaleIntercept_15();
  }

  private native boolean GetPlanarRGB_16();
  public boolean GetPlanarRGB()
  {
    return GetPlanarRGB_16();
  }

  private native void SetPlanarRGB_17(boolean id0);
  public void SetPlanarRGB(boolean id0)
  {
    SetPlanarRGB_17(id0);
  }

  private native void PlanarRGBOn_18();
  public void PlanarRGBOn()
  {
    PlanarRGBOn_18();
  }

  private native void PlanarRGBOff_19();
  public void PlanarRGBOff()
  {
    PlanarRGBOff_19();
  }

  private native void SetQFac_20(double id0);
  public void SetQFac(double id0)
  {
    SetQFac_20(id0);
  }

  private native double GetQFac_21();
  public double GetQFac()
  {
    return GetQFac_21();
  }

  private native void SetQFormMatrix_22(vtkMatrix4x4 id0);
  public void SetQFormMatrix(vtkMatrix4x4 id0)
  {
    SetQFormMatrix_22(id0);
  }

  private native long GetQFormMatrix_23();
  public vtkMatrix4x4 GetQFormMatrix()
  {
    long temp = GetQFormMatrix_23();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSFormMatrix_24(vtkMatrix4x4 id0);
  public void SetSFormMatrix(vtkMatrix4x4 id0)
  {
    SetSFormMatrix_24(id0);
  }

  private native long GetSFormMatrix_25();
  public vtkMatrix4x4 GetSFormMatrix()
  {
    long temp = GetSFormMatrix_25();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNIFTIHeader_26(vtkNIFTIImageHeader id0);
  public void SetNIFTIHeader(vtkNIFTIImageHeader id0)
  {
    SetNIFTIHeader_26(id0);
  }

  private native long GetNIFTIHeader_27();
  public vtkNIFTIImageHeader GetNIFTIHeader()
  {
    long temp = GetNIFTIHeader_27();

    if (temp == 0) return null;
    return (vtkNIFTIImageHeader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkNIFTIImageWriter() { super(); }

  public vtkNIFTIImageWriter(long id) { super(id); }
  public native long   VTKInit();

}
