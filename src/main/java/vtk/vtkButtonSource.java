// java wrapper for vtkButtonSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkButtonSource extends vtkPolyDataAlgorithm
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

  private native void SetCenter_4(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_4(id0,id1,id2);
  }

  private native void SetCenter_5(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_5(id0);
  }

  private native double[] GetCenter_6();
  public double[] GetCenter()
  {
    return GetCenter_6();
  }

  private native void SetTextureStyle_7(int id0);
  public void SetTextureStyle(int id0)
  {
    SetTextureStyle_7(id0);
  }

  private native int GetTextureStyleMinValue_8();
  public int GetTextureStyleMinValue()
  {
    return GetTextureStyleMinValue_8();
  }

  private native int GetTextureStyleMaxValue_9();
  public int GetTextureStyleMaxValue()
  {
    return GetTextureStyleMaxValue_9();
  }

  private native int GetTextureStyle_10();
  public int GetTextureStyle()
  {
    return GetTextureStyle_10();
  }

  private native void SetTextureStyleToFitImage_11();
  public void SetTextureStyleToFitImage()
  {
    SetTextureStyleToFitImage_11();
  }

  private native void SetTextureStyleToProportional_12();
  public void SetTextureStyleToProportional()
  {
    SetTextureStyleToProportional_12();
  }

  private native void SetTextureDimensions_13(int id0,int id1);
  public void SetTextureDimensions(int id0,int id1)
  {
    SetTextureDimensions_13(id0,id1);
  }

  private native void SetTextureDimensions_14(int id0[]);
  public void SetTextureDimensions(int id0[])
  {
    SetTextureDimensions_14(id0);
  }

  private native int[] GetTextureDimensions_15();
  public int[] GetTextureDimensions()
  {
    return GetTextureDimensions_15();
  }

  private native void SetShoulderTextureCoordinate_16(double id0,double id1);
  public void SetShoulderTextureCoordinate(double id0,double id1)
  {
    SetShoulderTextureCoordinate_16(id0,id1);
  }

  private native void SetShoulderTextureCoordinate_17(double id0[]);
  public void SetShoulderTextureCoordinate(double id0[])
  {
    SetShoulderTextureCoordinate_17(id0);
  }

  private native double[] GetShoulderTextureCoordinate_18();
  public double[] GetShoulderTextureCoordinate()
  {
    return GetShoulderTextureCoordinate_18();
  }

  private native void SetTwoSided_19(int id0);
  public void SetTwoSided(int id0)
  {
    SetTwoSided_19(id0);
  }

  private native int GetTwoSided_20();
  public int GetTwoSided()
  {
    return GetTwoSided_20();
  }

  private native void TwoSidedOn_21();
  public void TwoSidedOn()
  {
    TwoSidedOn_21();
  }

  private native void TwoSidedOff_22();
  public void TwoSidedOff()
  {
    TwoSidedOff_22();
  }

  public vtkButtonSource() { super(); }

  public vtkButtonSource(long id) { super(id); }

}
