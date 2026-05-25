// java wrapper for vtkVolumeOutlineSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolumeOutlineSource extends vtkPolyDataAlgorithm
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

  private native void SetVolumeMapper_4(vtkVolumeMapper id0);
  public void SetVolumeMapper(vtkVolumeMapper id0)
  {
    SetVolumeMapper_4(id0);
  }

  private native long GetVolumeMapper_5();
  public vtkVolumeMapper GetVolumeMapper()
  {
    long temp = GetVolumeMapper_5();

    if (temp == 0) return null;
    return (vtkVolumeMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateScalars_6(int id0);
  public void SetGenerateScalars(int id0)
  {
    SetGenerateScalars_6(id0);
  }

  private native void GenerateScalarsOn_7();
  public void GenerateScalarsOn()
  {
    GenerateScalarsOn_7();
  }

  private native void GenerateScalarsOff_8();
  public void GenerateScalarsOff()
  {
    GenerateScalarsOff_8();
  }

  private native int GetGenerateScalars_9();
  public int GetGenerateScalars()
  {
    return GetGenerateScalars_9();
  }

  private native void SetGenerateOutline_10(int id0);
  public void SetGenerateOutline(int id0)
  {
    SetGenerateOutline_10(id0);
  }

  private native void GenerateOutlineOn_11();
  public void GenerateOutlineOn()
  {
    GenerateOutlineOn_11();
  }

  private native void GenerateOutlineOff_12();
  public void GenerateOutlineOff()
  {
    GenerateOutlineOff_12();
  }

  private native int GetGenerateOutline_13();
  public int GetGenerateOutline()
  {
    return GetGenerateOutline_13();
  }

  private native void SetGenerateFaces_14(int id0);
  public void SetGenerateFaces(int id0)
  {
    SetGenerateFaces_14(id0);
  }

  private native void GenerateFacesOn_15();
  public void GenerateFacesOn()
  {
    GenerateFacesOn_15();
  }

  private native void GenerateFacesOff_16();
  public void GenerateFacesOff()
  {
    GenerateFacesOff_16();
  }

  private native int GetGenerateFaces_17();
  public int GetGenerateFaces()
  {
    return GetGenerateFaces_17();
  }

  private native void SetColor_18(double id0,double id1,double id2);
  public void SetColor(double id0,double id1,double id2)
  {
    SetColor_18(id0,id1,id2);
  }

  private native void SetColor_19(double id0[]);
  public void SetColor(double id0[])
  {
    SetColor_19(id0);
  }

  private native double[] GetColor_20();
  public double[] GetColor()
  {
    return GetColor_20();
  }

  private native void SetActivePlaneId_21(int id0);
  public void SetActivePlaneId(int id0)
  {
    SetActivePlaneId_21(id0);
  }

  private native int GetActivePlaneId_22();
  public int GetActivePlaneId()
  {
    return GetActivePlaneId_22();
  }

  private native void SetActivePlaneColor_23(double id0,double id1,double id2);
  public void SetActivePlaneColor(double id0,double id1,double id2)
  {
    SetActivePlaneColor_23(id0,id1,id2);
  }

  private native void SetActivePlaneColor_24(double id0[]);
  public void SetActivePlaneColor(double id0[])
  {
    SetActivePlaneColor_24(id0);
  }

  private native double[] GetActivePlaneColor_25();
  public double[] GetActivePlaneColor()
  {
    return GetActivePlaneColor_25();
  }

  public vtkVolumeOutlineSource() { super(); }

  public vtkVolumeOutlineSource(long id) { super(id); }
  public native long   VTKInit();

}
