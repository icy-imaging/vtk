// java wrapper for vtkKCoreLayout object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkKCoreLayout extends vtkGraphAlgorithm
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

  private native void SetGraphConnection_4(vtkAlgorithmOutput id0);
  public void SetGraphConnection(vtkAlgorithmOutput id0)
  {
    SetGraphConnection_4(id0);
  }

  private native int FillInputPortInformation_5(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_5(id0,id1);
  }

  private native void SetKCoreLabelArrayName_6(byte[] id0, int len0);
  public void SetKCoreLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetKCoreLabelArrayName_6(bytes0, bytes0.length);
  }

  private native boolean GetPolar_7();
  public boolean GetPolar()
  {
    return GetPolar_7();
  }

  private native void SetPolar_8(boolean id0);
  public void SetPolar(boolean id0)
  {
    SetPolar_8(id0);
  }

  private native void PolarOn_9();
  public void PolarOn()
  {
    PolarOn_9();
  }

  private native void PolarOff_10();
  public void PolarOff()
  {
    PolarOff_10();
  }

  private native boolean GetCartesian_11();
  public boolean GetCartesian()
  {
    return GetCartesian_11();
  }

  private native void SetCartesian_12(boolean id0);
  public void SetCartesian(boolean id0)
  {
    SetCartesian_12(id0);
  }

  private native void CartesianOn_13();
  public void CartesianOn()
  {
    CartesianOn_13();
  }

  private native void CartesianOff_14();
  public void CartesianOff()
  {
    CartesianOff_14();
  }

  private native void SetPolarCoordsRadiusArrayName_15(byte[] id0, int len0);
  public void SetPolarCoordsRadiusArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPolarCoordsRadiusArrayName_15(bytes0, bytes0.length);
  }

  private native byte[] GetPolarCoordsRadiusArrayName_16();
  public String GetPolarCoordsRadiusArrayName()
  {
    return new String(GetPolarCoordsRadiusArrayName_16(), StandardCharsets.UTF_8);
  }

  private native void SetPolarCoordsAngleArrayName_17(byte[] id0, int len0);
  public void SetPolarCoordsAngleArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPolarCoordsAngleArrayName_17(bytes0, bytes0.length);
  }

  private native byte[] GetPolarCoordsAngleArrayName_18();
  public String GetPolarCoordsAngleArrayName()
  {
    return new String(GetPolarCoordsAngleArrayName_18(), StandardCharsets.UTF_8);
  }

  private native void SetCartesianCoordsXArrayName_19(byte[] id0, int len0);
  public void SetCartesianCoordsXArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCartesianCoordsXArrayName_19(bytes0, bytes0.length);
  }

  private native byte[] GetCartesianCoordsXArrayName_20();
  public String GetCartesianCoordsXArrayName()
  {
    return new String(GetCartesianCoordsXArrayName_20(), StandardCharsets.UTF_8);
  }

  private native void SetCartesianCoordsYArrayName_21(byte[] id0, int len0);
  public void SetCartesianCoordsYArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCartesianCoordsYArrayName_21(bytes0, bytes0.length);
  }

  private native byte[] GetCartesianCoordsYArrayName_22();
  public String GetCartesianCoordsYArrayName()
  {
    return new String(GetCartesianCoordsYArrayName_22(), StandardCharsets.UTF_8);
  }

  private native void SetEpsilon_23(float id0);
  public void SetEpsilon(float id0)
  {
    SetEpsilon_23(id0);
  }

  private native float GetEpsilon_24();
  public float GetEpsilon()
  {
    return GetEpsilon_24();
  }

  private native void SetUnitRadius_25(float id0);
  public void SetUnitRadius(float id0)
  {
    SetUnitRadius_25(id0);
  }

  private native float GetUnitRadius_26();
  public float GetUnitRadius()
  {
    return GetUnitRadius_26();
  }

  public vtkKCoreLayout() { super(); }

  public vtkKCoreLayout(long id) { super(id); }
  public native long   VTKInit();

}
